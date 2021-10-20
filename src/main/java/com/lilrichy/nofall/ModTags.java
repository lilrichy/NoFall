package com.lilrichy.nofall;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final Tag.Identified<Block> CONCRETE_POWDER = createCommonTag("concrete_powder");
        public static final Tag.Identified<Block> GRAVEL = createCommonTag("gravel");
        public static final Tag.Identified<Block> SAND = createCommonTag("sand");

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(NoFall.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }

    }

    public static class Items {
        public static final Tag.Identified<Item> CONCRETE_POWDER = createCommonTag("concrete_powder");
        public static final Tag.Identified<Item> GRAVEL = createCommonTag("gravel");
        public static final Tag.Identified<Item> SAND = createCommonTag("sand");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(NoFall.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }

    }

}
