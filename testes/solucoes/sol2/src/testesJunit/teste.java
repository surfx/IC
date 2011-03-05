package testesJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import conectivos.ConectivoBinario;
import conectivos.ConectivoUnario;
import conectivos.ConectivoZeroario;
import conectivos.IConectivo;
import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormulaAtomica;
import formulas.IFormulaComposta;


public class teste {
	
	@Test
	public void teste1() {
		IFormulaAtomica fa1 = new FormulaAtomica("A1");
		IFormulaAtomica fa2 = new FormulaAtomica("A2");
		assertTrue(fa1.isAtomic());
		assertTrue(fa2.isAtomic());
		
		IConectivo conec = new ConectivoBinario("&", fa1, fa2);
		assertEquals(conec.getAridade(), 2);
		
		conec = new ConectivoBinario("||", fa1, fa2);
		assertEquals(conec.getAridade(), 2);
		
		conec = new ConectivoUnario("!", fa1);
		assertEquals(conec.getAridade(), 1);
		
		conec = new ConectivoUnario("!", fa2);
		assertEquals(conec.getAridade(), 1);
		
		conec = new ConectivoZeroario("TOP");
		assertEquals(conec.getAridade(), 0);
		
		IFormulaComposta fc = new FormulaComposta(conec);
		assertTrue(!fc.isAtomic());
		
		conec = new ConectivoBinario("&", fa1, fa2);
		fc = new FormulaComposta(conec);
		assertFalse(fc.isAtomic());
		
		conec = new ConectivoBinario("&", fc, fc);
		assertEquals(conec.getAridade(), 2);
	}
	
	@Test
	public void teste2(){
		IFormulaAtomica fa1 = new FormulaAtomica("A1");
		IFormulaAtomica fa2 = new FormulaAtomica("A2");
		IConectivo conec = new ConectivoBinario("&", fa1, fa2);
		IFormulaComposta fc = new FormulaComposta(conec);
		assertFalse(fc.isAtomic());
	}
}