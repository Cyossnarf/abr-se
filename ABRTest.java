package abr;

import static org.junit.Assert.*;

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
		Node rac = poirier.getRacine();
		assertEquals(rac.getValeur(), 8);
		poirier.insert(3);
		poirier.insert(10);
		Node fdRac = rac.getFilsDroit().getRacine();
		Node fgRac = rac.getFilsGauche().getRacine();
		assertEquals(fdRac.getValeur(), 10);
		assertEquals(fgRac.getValeur(), 3);
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

}
