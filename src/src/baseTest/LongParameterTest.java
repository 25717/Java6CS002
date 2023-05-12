package baseTest;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;
import java.awt.Graphics;

import base.PictureFrame;
import base.PictureFrame.DominoPanel;
import java.awt.image.BufferedImage;
import org.junit.Before;


class LongParameterTest {

	private Graphics g;
	private BufferedImage image;
    private DominoPanel dp;
    
    @Before
    public void setUp() {
        image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        g = image.getGraphics();
        dp = new DominoPanel(50, 50, 30, 5, Color.RED);
    }
    
    @Test
    public void testDrawDigitGivenCentre() {
        // Call the method to be tested
        new PictureFrame().new DominoPanel(50, 50, 30, 5, Color.RED).drawDigitGivenCentre(g, dp);

        // Check if the expected color is in the center pixel of the image
        int centerPixelColor = image.getRGB(50, 50);
        assertEquals(dp.c.getRGB(), centerPixelColor);
    }
}
