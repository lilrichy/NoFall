package com.lilrichy.nofall.block;

import com.lilrichy.nofall.NoFall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block GRAVEL_NOFALL = registerBlock("gravel_nofall",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).mapColor(MapColor.STONE_GRAY).strength(0.6F).sounds(
                    BlockSoundGroup.GRAVEL)));

    public static final Block SAND_NOFALL = registerBlock("sand_nofall",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).mapColor(MapColor.PALE_YELLOW).strength(0.5F)
                                         .sounds(BlockSoundGroup.SAND)));

    public static final Block RED_SAND_NOFALL = registerBlock("red_sand_nofall",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).mapColor(MapColor.ORANGE).strength(0.5F)
                                         .sounds(BlockSoundGroup.SAND)));

    public static final Block WHITE_CONCRETE_POWDER_NOFALL = registerBlock("white_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(WHITE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.WHITE).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block ORANGE_CONCRETE_POWDER_NOFALL = registerBlock("orange_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(ORANGE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.ORANGE).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block MAGENTA_CONCRETE_POWDER_NOFALL = registerBlock("magenta_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(MAGENTA_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.MAGENTA).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block LIGHT_BLUE_CONCRETE_POWDER_NOFALL = registerBlock("light_blue_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(LIGHT_BLUE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.LIGHT_BLUE).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block YELLOW_CONCRETE_POWDER_NOFALL = registerBlock("yellow_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(YELLOW_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.YELLOW).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block LIME_CONCRETE_POWDER_NOFALL = registerBlock("lime_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(LIME_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.LIME).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block PINK_CONCRETE_POWDER_NOFALL = registerBlock("pink_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(PINK_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.PINK).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block GRAY_CONCRETE_POWDER_NOFALL = registerBlock("gray_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(GRAY_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.GRAY).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block LIGHT_GRAY_CONCRETE_POWDER_NOFALL = registerBlock("light_gray_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(LIGHT_GRAY_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.LIGHT_GRAY).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block CYAN_CONCRETE_POWDER_NOFALL = registerBlock("cyan_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(CYAN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.CYAN).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block PURPLE_CONCRETE_POWDER_NOFALL = registerBlock("purple_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(PURPLE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.PURPLE).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block BLUE_CONCRETE_POWDER_NOFALL = registerBlock("blue_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(BLUE_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.BLUE).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block BROWN_CONCRETE_POWDER_NOFALL = registerBlock("brown_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(BROWN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.BROWN).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block GREEN_CONCRETE_POWDER_NOFALL = registerBlock("green_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(GREEN_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.GREEN).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block RED_CONCRETE_POWDER_NOFALL = registerBlock("red_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(RED_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.RED).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    public static final Block BLACK_CONCRETE_POWDER_NOFALL = registerBlock("black_concrete_powder_nofall",
            new ConcretePowderBlockNoFall(BLACK_CONCRETE, AbstractBlock.Settings.of(Material.AGGREGATE,
                    DyeColor.BLACK).strength(0.5F).sounds(BlockSoundGroup.SAND)));

    //==================================================================================================================
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(NoFall.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(NoFall.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(NoFall.ModItemGroup.NOFALL)));
    }

    public static void registerModBlocks() {
        NoFall.LOGGER.info("Registering ModBlocks for " + NoFall.MOD_ID);
    }

}
