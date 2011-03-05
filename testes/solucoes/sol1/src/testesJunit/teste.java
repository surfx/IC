package testesJunit;

import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormulaAtomica;
import formulas.IFormulaComposta;

import org.junit.Test;
import conectivos.Conectivo;
import conectivos.IConectivo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class teste {
	
	@Test
	public void teste1() {
		IFormulaAtomica fa1 = new FormulaAtomica("A1");
		IFormulaAtomica fa2 = new FormulaAtomica("A2");
		assertTrue(fa1.isAtomic());
		assertTrue(fa2.isAtomic());
		
		IConectivo conec = new Conectivo("&");
		conec.addFormula(fa1);
		conec.addFormula(fa2);
		assertEquals(conec.getAridade(), 2);
		
		conec = new Conectivo("||");
		conec.addFormula(fa1);
		conec.addFormula(fa2);
		assertEquals(conec.getAridade(), 2);
		
		conec = new Conectivo("!");
		conec.addFormula(fa1);
		assertEquals(conec.getAridade(), 1);
		
		conec = new Conectivo("TOP");
		assertEquals(conec.getAridade(), 0);
		
		IFormulaComposta fc = new FormulaComposta(conec);
		assertTrue(!fc.isAtomic());
		
		conec = new Conectivo("&");
		conec.addFormula(fa1);
		conec.addFormula(fa2);
		fc = new FormulaComposta(conec);
		assertFalse(fc.isAtomic());
		
		conec = new Conectivo("&");
		conec.addFormula(fc);
		conec.addFormula(fc);
		assertEquals(conec.getAridade(), 2);
	}
	
	@Test
	public void teste2(){
		IFormulaAtomica fa1 = new FormulaAtomica("A1");
		IFormulaAtomica fa2 = new FormulaAtomica("A2");
		IConectivo conec = new Conectivo("&");
		conec.addFormula(fa1);
		conec.addFormula(fa2);
		IFormulaComposta fc = new FormulaComposta(conec);
		assertFalse(fc.isAtomic());
	}
}
