// Define the grid and square size
var gridSize = 16;
var gridLineWidth = 1;
var squareSize = 16 - gridLineWidth; // Size excluding the 1-pixel grid line

// Define the output folder path
var outputFolderPath = "/Users/roberto/Documents/GitHub/instrumenta-brundisii/processed_images";

// Get the active document
var doc = app.activeDocument;

// Determine the total size of the image
var imageWidth = doc.width.as("px");
var imageHeight = doc.height.as("px");

// Determine the total number of squares
var numCols = Math.floor(imageWidth / (gridSize + gridLineWidth));
var numRows = Math.floor(imageHeight / (gridSize + gridLineWidth));

// Function to check if a layer is within the given square
function isLayerInSquare(layer, left, top, right, bottom) {
    var bounds = layer.bounds;
    var layerLeft = parseInt(bounds[0]);
    var layerTop = parseInt(bounds[1]);
    var layerRight = parseInt(bounds[2]);
    var layerBottom = parseInt(bounds[3]);

    return (layerLeft < right && layerRight > left && layerTop < bottom && layerBottom > top);
}

// Function to get all visible layers in a document, including layers within groups
function getVisibleLayers(layers) {
    var visibleLayers = [];
    for (var i = 0; i < layers.length; i++) {
        var layer = layers[i];
        if (layer.typename == "ArtLayer" && layer.visible) {
            visibleLayers.push(layer);
        } else if (layer.typename == "LayerSet") {
            visibleLayers = visibleLayers.concat(getVisibleLayers(layer.layers));
        }
    }
    return visibleLayers;
}

// Get a list of all visible layers
var visibleLayers = getVisibleLayers(doc.layers);
$.writeln("Total visible layers: " + visibleLayers.length);

// Generate a list of all squares
var squares = [];
for (var row = 0; row < numRows; row++) {
    for (var col = 0; col < numCols; col++) {
        var left = col * (gridSize + gridLineWidth) + 1;
        var top = row * (gridSize + gridLineWidth) + 1;
        var right = left + gridSize - 1;
        var bottom = top + gridSize - 1;
        squares.push({left: left, top: top, right: right, bottom: bottom, row: row, col: col});
    }
}

// Check each square and export layers
for (var s = 0; s < squares.length; s++) {
    var square = squares[s];
    var layersInSquare = [];

    // Find layers within the current square
    for (var i = 0; i < visibleLayers.length; i++) {
        if (isLayerInSquare(visibleLayers[i], square.left, square.top, square.right, square.bottom)) {
            layersInSquare.push(visibleLayers[i]);
        }
    }

    // Log the number of layers in the current square
    $.writeln("Square (" + square.row + "," + square.col + ") has " + layersInSquare.length + " layers.");

    // Ignore empty squares
    if (layersInSquare.length > 0) {
        for (var i = 0; i < layersInSquare.length; i++) {
            var layer = layersInSquare[i];
            var layerName = layer.name;

            // Make only the current layer visible
            for (var j = 0; j < doc.artLayers.length; j++) {
                doc.artLayers[j].visible = false;
            }
            layer.visible = true;

            // Log the layer being processed
            $.writeln("Processing layer: " + layerName + " in square (" + square.row + "," + square.col + ")");

            // Duplicate the document
            var tempDoc = doc.duplicate();

            // Crop the duplicate document to the region of the current square
            tempDoc.crop([square.left, square.top, square.right, square.bottom]);

            // Export the cropped region as a PNG file for each layer in the square
            var file = new File(outputFolderPath + "/" + layerName + ".png");
            var pngOptions = new PNGSaveOptions();
            pngOptions.compression = 6; // Set compression level
            pngOptions.interlaced = false;

            try {
                // Save the cropped document as PNG
                tempDoc.saveAs(file, pngOptions, true, Extension.LOWERCASE);

                // Log successful save
                $.writeln("Saved layer: " + layerName + " as " + file.fsName);
            } catch (e) {
                // Log any errors during save
                $.writeln("Error saving layer: " + layerName + " - " + e.message);
            }

            // Close the duplicate document without saving
            tempDoc.close(SaveOptions.DONOTSAVECHANGES);
        }
    }
}

// Reset visibility of all layers
for (var k = 0; k < doc.artLayers.length; k++) {
    doc.artLayers[k].visible = true;
}

$.writeln("Script finished processing all squares.");
