
package tk.merith.nullable.block;

import net.minecraft.world.BlockView;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.loot.context.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class CoinForgeBlock extends Block {
	public CoinForgeBlock() {
		super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.METAL).strength(1f, 10f).luminance(0));
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options) {
		tooltip.add(new LiteralText("Unfinished"));
		tooltip.add(new LiteralText("This is supposed to be used to convert"));
		tooltip.add(new LiteralText("coins from one type to another."));
	}

	@Override
	public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDroppedStacks(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
