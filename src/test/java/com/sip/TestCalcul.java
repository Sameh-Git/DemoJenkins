package com.sip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sip.amsutil.Calcul;

class TestCalcul {

	@Test
	void testSomme() {
		Calcul c=new Calcul();
		int res=c.somme(10, 20);
		assertEquals(res,30);
	}
	

	@Test
	void testProduit() {
		Calcul c=new Calcul();
		int res=c.produit(2, 5);
		assertEquals(res,10);
	}

	

	@Test
	void testDivision() {
		Calcul c=new Calcul();
		double res=c.division(6, 3);
		assertEquals(res,2);
	}
}
