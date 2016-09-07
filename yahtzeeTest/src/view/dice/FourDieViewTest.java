package view.dice;

import java.util.ArrayList;

import narrTest.NarrTestCase;

public class FourDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, FourDieView.class);
	}

	public void testLooksLikeFour() throws Exception {
		FourDieView fourDieView = new FourDieView();
		ArrayList<String> rowsToDraw = assertIsOfTypeAndGet(ArrayList.class,
				fourDieView.getRowsToDraw());
		assertEquals(5, rowsToDraw.size());

		assertEquals("| •   • |", rowsToDraw.get(1));
		assertEquals("|       |", rowsToDraw.get(2));
		assertEquals("| •   • |", rowsToDraw.get(3));
	}
}
