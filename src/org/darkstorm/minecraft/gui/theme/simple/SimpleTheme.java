package org.darkstorm.minecraft.gui.theme.simple;

import java.awt.Font;

import org.darkstorm.minecraft.gui.theme.AbstractTheme;

import net.minecraft.client.gui.FontRenderer;
import tk.wurst_client.font.WolframFontRenderer;

public class SimpleTheme extends AbstractTheme
{
	private final FontRenderer fontRenderer;
	
	public SimpleTheme()
	{
		fontRenderer = new WolframFontRenderer(
			new Font("Trebuchet MS", Font.PLAIN, 15), true, 8);
		
		installUI(new SimpleFrameUI(this));
		installUI(new SimplePanelUI(this));
		installUI(new SimpleLabelUI(this));
		installUI(new SimpleButtonUI(this));
		installUI(new SimpleCheckButtonUI(this));
		installUI(new SimpleComboBoxUI(this));
		installUI(new SimpleSliderUI(this));
		installUI(new SimpleProgressBarUI(this));
	}
	
	public FontRenderer getFontRenderer()
	{
		return fontRenderer;
	}
}
