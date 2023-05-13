package baseTest;

import static org.junit.Assert.*;
import java.awt.*;
import javax.swing.JPanel;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import base.Domino;
import base.PictureFrame;

public class MagicNumberTest {
	private PictureFrame pictureFrame;

	@Before
	public void setUp() {
		pictureFrame = new PictureFrame();
	}
	
	@Test
	public void testDrawHeadings() {
		Graphics g = null;
		JPanel panel = pictureFrame.new DominoPanel(0, 0, 0, 0, Color.BLACK);
        pictureFrame.new DominoPanel(30, 30, 20, 1, Color.BLUE).drawHeadings(g);
        assertEquals("should draw correct number of headings", 15, panel.getComponentCount());
  
	}
	
	 @Test
    public void testDrawDomino() {
        Graphics g = null; // create a dummy graphics object
        JPanel panel = pictureFrame.new DominoPanel(0, 0, 0, 0, Color.BLACK);
        Domino d = new Domino(1, 2);
        pictureFrame.new DominoPanel(30, 30, 20, 1, Color.BLUE).drawDomino(g, d);
        assertEquals("should draw correct number of digits", 2, panel.getComponentCount());
    }


}
