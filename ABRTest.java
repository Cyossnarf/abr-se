package abr;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ABRTest {

	@Test
	public void testIsEmpty() {
		ABR pommier = new ABR();
		assertTrue("devrait etre vide", pommier.isEmpty());
	}
	
	@Test
	public void testInsert() {
		ABR poirier = new ABR();
		poirier.insert(8);
		assertFalse("ne devrait pas etre vide", poirier.isEmpty());
		int racVal = poirier.getRacValeur();
		assertEquals(racVal, 8);
		poirier.insert(3);
		poirier.insert(10);
		int fdRacVal = poirier.getRacFilsDroit().getRacValeur();
		int fgRacVal = poirier.getRacFilsGauche().getRacValeur();
		assertEquals(fdRacVal, 10);
		assertEquals(fgRacVal, 3);
	}
	
	@Test
	public void testNbElements() {
		ABR prunier = new ABR();
		prunier.insert(8);
		prunier.insert(3);
		prunier.insert(10);
		prunier.insert(1);
		prunier.insert(6);
		assertEquals(prunier.nbElements(), 5);
	}
	
	@Test
	public void testContains() {
		ABR prunier = new ABR();
		prunier.insert(8);
		prunier.insert(3);
		prunier.insert(10);
		prunier.insert(1);
		prunier.insert(6);
		assertTrue(prunier.contains(6));
		assertFalse(prunier.contains(4));
	}
	
	@Test
	public void testToList() {
		ABR prunier = new ABR();
		prunier.insert(8);
		prunier.insert(3);
		prunier.insert(10);
		prunier.insert(1);
		prunier.insert(6);
		List<Integer> liste = null;
		prunier.toList(liste);
		assertEquals((int) liste.get(3),8);
	}

}
