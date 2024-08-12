import pandas as pd

def gen_floor(list_of_names:list):
    '''
        Pass a list of names and get all generators
    '''
    def mod_blocks(tile):
        mod_blocks = f'''
            public static final RegistryObject<Block> {tile.upper()} = registerBlock("{tile.lower()}",
                    () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).strength(3f)));
            public static final RegistryObject<Block> {tile.upper()}_CORNER = registerBlock("{tile.lower()}_corner",
                    () -> new PlayerFacingBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)));        
        '''
        return mod_blocks
    
    def loot_tables(tile):
        loot_tables = f'''
            this.dropSelf(ModBlocks.{tile.upper()}.get());
            this.dropSelf(ModBlocks.{tile.upper()}_CORNER.get());      
        '''
        return loot_tables
    
    def state_provider(tile):    
        state_provider = f'''    
            logBlock(((RotatedPillarBlock) ModBlocks.{tile.upper()}.get()));
            blockItem(ModBlocks.{tile.upper()});
            makePlayerFacingBlock(ModBlocks.{tile.upper()}_CORNER, "{tile.lower()}_corner");
        '''
        return state_provider
    
    def mod_tabs(tile):    
        mod_tabs = f'''           
            pOutput.accept(ModBlocks.{tile.upper()}.get());
            pOutput.accept(ModBlocks.{tile.upper()}_CORNER.get());
        '''
        return mod_tabs
    
    def lang(tile):
        lang = f'''
            "block.instrumenta_brundisii.{tile.lower()}": "{tile.replace("_", " ").title()}",
            "block.instrumenta_brundisii.{tile.lower()}_corner": "{tile.replace("_", " ").title()} Corner",
        '''
        return lang
    
    
    print('''
              MOD BLOCKS:
            ================= 
          ''')
    for name in list_of_names:
        print(mod_blocks(name))

    print('''
              LOOT TABLES:
            ================= 
          ''')
    for name in list_of_names:
        print(loot_tables(name))

    print('''
             STATE PROVIDER:
            ================= 
          ''')
    for name in list_of_names:
        print(state_provider(name))
        

    print('''
               MOD TABS:
            ================= 
          ''')
    for name in list_of_names:
        print(mod_tabs(name))
        
    print('''
            LANG:
        ================= 
        ''')
    for name in list_of_names:
        print(lang(name))
        
        
def gen_crop_class(crop_name, max_age=5):
    class_boilerplate = f'''
package net.nicneo.instrumenta_brundisii.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.nicneo.instrumenta_brundisii.item.ModItems;

public class {crop_name.capitalize()}CropBlock extends CropBlock {{
    public static final int MAX_AGE = {max_age};
    public static final IntegerProperty AGE = BlockStateProperties.AGE_{max_age};

    public {crop_name.capitalize()}CropBlock(Properties pProperties) {{
        super(pProperties);
    }}

    @Override
    protected ItemLike getBaseSeedId() {{
        return ModItems.{crop_name.upper()}_SEEDS.get();
    }}

    @Override
    public IntegerProperty getAgeProperty() {{
        return AGE;
    }}

    @Override
    public int getMaxAge() {{
        return MAX_AGE;
    }}

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {{
        pBuilder.add(AGE);
    }}
}}
    '''
    
    with open(f"./{crop_name.capitalize()}CropBlock.java", "w") as file:
        file.write(class_boilerplate)
        
def gen_crop(list_of_names:list, max_age=5):
    '''
        Pass a list of names and get all generators
    '''
    def mod_blocks(crop):
        mod_blocks = f'''
    public static final RegistryObject<Block> {crop.upper()}_CROP = BLOCKS.register("{crop.lower()}_crop",
            () -> new {crop.capitalize()}CropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));  
        '''
        return mod_blocks

    def loot_tables(crop):
        loot_tables = f'''
//      {crop.upper()} CROP:
        LootItemCondition.Builder lootitemcondition$builder_{crop.lower()} = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.{crop.upper()}_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty({crop.capitalize()}CropBlock.AGE, 5));

        this.add(ModBlocks.{crop.upper()}_CROP.get(), createCropDrops(ModBlocks.{crop.upper()}_CROP.get(), ModItems.{crop.upper()}.get(),
                ModItems.{crop.upper()}_SEEDS.get(), lootitemcondition$builder_barley));
        '''
        return loot_tables

    def state_provider(crop):
        state_provider = f'''
//  {crop.upper()}
    public void make{crop.capitalize()}Crop(CropBlock block, String modelName, String textureName) {{
        Function<BlockState, ConfiguredModel[]> function = state -> {crop.lower()}States(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }}
    private ConfiguredModel[] {crop.lower()}States(BlockState state, CropBlock block, String modelName, String textureName) {{
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue((({crop.capitalize()}CropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue((({crop.capitalize()}CropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
        
    ================================================
    
    make{crop.capitalize()}Crop((CropBlock) ModBlocks.{crop.upper()}_CROP.get(), "{crop.lower()}_stage", "{crop.lower()}_stage");
    
    }}
        '''
        return state_provider

    def model_provider(crop):
        model_provider = f'''
        simpleItem(ModItems.{crop.capitalize()}_SEEDS);
        simpleItem(ModItems.{crop.capitalize()});
        '''
        return model_provider

    def mod_tab(crop):
        mod_tab = f'''
//                      {crop.capitalize()}:
                        pOutput.accept(ModItems.{crop.capitalize()}.get());
                        pOutput.accept(ModItems.{crop.capitalize()}_SEEDS.get());
        '''
        return mod_tab

    def mod_items(crop):
        mod_items = f'''
    public static final RegistryObject<Item> {crop.capitalize()}_SEEDS = ITEMS.register("{crop.lower()}_seeds",
            () -> new ItemNameBlockItem(ModBlocks.{crop.capitalize()}_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> {crop.capitalize()} = ITEMS.register("{crop.lower()}",
            () -> new Item(new Item.Properties().stacksTo(64)));
        '''
        return mod_items

    def lang(crop):
        lang = f'''
  "item.instrumenta_brundisii.{crop.lower()}": "{crop.capitalize()}",
  "item.instrumenta_brundisii.{crop.lower()}_seeds": "{crop.capitalize()} Seeds",
        '''
        return lang

    
    for name in list_of_names:
        gen_crop_class(name, max_age)
    
    print('''
              MOD BLOCKS:
            ================= 
          ''')
    for name in list_of_names:
        print(mod_blocks(name))
    
    print('''
              LOOT TABLES:
            ================= 
          ''')
    for name in list_of_names:
        print(loot_tables(name))
    
    print('''
              STATE PROVIDER:
            ================= 
          ''')
    for name in list_of_names:
        print(state_provider(name))
    
    print('''
              MODEL PROVIDER:
            ================= 
          ''')
    for name in list_of_names:
        print(model_provider(name))
    
    print('''
              MOD TAB:
            ================= 
          ''')
    for name in list_of_names:
        print(mod_tab(name))
    
    print('''
              MOD ITEMS:
            ================= 
          ''')
    for name in list_of_names:
        print(mod_items(name))
    
    print('''
              LANG:
            ================= 
          ''')
    for name in list_of_names:
        print(lang(name))