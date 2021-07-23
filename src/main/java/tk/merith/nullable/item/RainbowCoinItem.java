
package tk.merith.nullable.item;

import tk.merith.nullable.NullableMod;

import net.minecraft.world.World;
import net.minecraft.util.Rarity;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class RainbowCoinItem extends Item {
	public RainbowCoinItem() {
		super(new FabricItemSettings().group(NullableMod.NullableCoins).maxCount(64).fireproof().rarity(Rarity.COMMON));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (1F);
	}

	@Environment(EnvType.CLIENT)
	@Override
	public boolean hasGlint(ItemStack stack) {
		return true;
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(new LiteralText("Coin of unknown origin"));
		tooltip.add(new LiteralText("Radiates with Magical Energy"));
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
