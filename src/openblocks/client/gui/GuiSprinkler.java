package openblocks.client.gui;

import net.minecraft.util.StatCollector;
import openblocks.common.container.ContainerSprinkler;
import openblocks.utils.CompatibilityUtils;

import org.lwjgl.opengl.GL11;

public class GuiSprinkler extends BaseGuiContainer<ContainerSprinkler> {

	public GuiSprinkler(ContainerSprinkler container) {
		super(container);
		xSize = 176;
		ySize = 167;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int left = (this.width - this.xSize) / 2;
		int top = (this.height - this.ySize) / 2;
		CompatibilityUtils.bindTextureToClient("textures/gui/sprinkler.png");
		drawTexturedModalRect(left, top, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String machineName = StatCollector.translateToLocal("openblocks.gui.sprinkler");
		int x = this.xSize / 2 - (fontRenderer.getStringWidth(machineName) / 2);
		fontRenderer.drawString(machineName, x, 6, 4210752);
		String translatedName = StatCollector.translateToLocal("container.inventory");
		fontRenderer.drawString(translatedName, 8, this.ySize - 96 + 2, 4210752);
	}

}
