package baseTest;

import org.junit.Test;

import base.PictureFrame;

import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LongParameterTest {
  
  @Test
  public void testDrawDigitGivenCenter() {
    PictureFrame pf = new PictureFrame();
    PictureFrame.DominoPanel dp = pf.new DominoPanel(50, 50, 20, 5, Color.RED);
    JPanel panel = new JPanel() {
      public void paintComponent(Graphics g) {
        dp.drawDigitGivenCentre(g, dp);
      }
    };
    panel.setSize(100, 100);
    Graphics g = panel.getGraphics();
    dp.drawDigitGivenCentre(g, dp);
    // Replace 55 with the expected x coordinate of the drawn digit
    // Replace 55 with the expected y coordinate of the drawn digit
    // Replace 5 with the expected digit to be drawn
    assertEquals(Color.RED, panel.getBackground());
    assertEquals(55, dp.x);
    assertEquals(55, dp.y);
    assertEquals(5, dp.n);
    assertEquals(20, dp.diameter);
  }
}