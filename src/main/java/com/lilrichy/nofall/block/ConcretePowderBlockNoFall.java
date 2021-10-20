package com.lilrichy.nofall.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class ConcretePowderBlockNoFall extends Block{

    private final BlockState hardenedState;

    public ConcretePowderBlockNoFall(Block hardened, AbstractBlock.Settings settings) {
        super(settings);
        this.hardenedState = hardened.getDefaultState();
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockView blockView = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = blockView.getBlockState(blockPos);
        return shouldHarden(blockView, blockPos, blockState) ? this.hardenedState : super.getPlacementState(ctx);
    }

    private static boolean shouldHarden(BlockView world, BlockPos pos, BlockState state) {
        return hardensIn(state) || hardensOnAnySide(world, pos);
    }

    private static boolean hardensOnAnySide(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        Direction[] var4 = Direction.values();
        int var5 = var4.length;

        for (Direction direction : var4) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction != Direction.DOWN || hardensIn(blockState)) {
                mutable.set(pos, direction);
                blockState = world.getBlockState(mutable);
                if (hardensIn(blockState) && ! blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) {
                    bl = true;
                    break;
                }
            }
        }

        return bl;
    }

    private static boolean hardensIn(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return hardensOnAnySide(world, pos) ? this.hardenedState : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public int getColor(BlockState state, BlockView world, BlockPos pos) {
        return state.getMapColor(world, pos).color;
    }
}
