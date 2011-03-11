import conectivos.EnumsConectivos.Conectivo;
import formulas.FormulaAtomica;
import formulas.FormulaBinaria;
import formulas.FormulaUnaria;
import formulas.interfaces.IFormula;

public class main {

	public static void main(String[] args) {
		//formulas
//		IFormulaAtomica fa1 = new FormulaAtomica("A1");
//		IFormulaAtomica fa2 = new FormulaAtomica("A2");
//		System.out.println(fa1);
//		System.out.println(fa2);
//		
//		IFormulaZeroaria fz = new FormulaZeroaria(Conectivo.BOTTOM);
//		System.out.println(fz);
//		
//		IFormulaUnaria fu = new FormulaUnaria(Conectivo.NEGATION, fa1);
//		System.out.println(fu);
//		
//		IFormulaBinaria fb = new FormulaBinaria(Conectivo.CONSYSTENCY, fa1, fu);
//		System.out.println(fb);

		System.out.println("-(i)------------------------");
		IFormula vet[] = new IFormula[1000000];
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = new FormulaAtomica("A" + i);
			} else {
				vet[i] = new FormulaBinaria(Conectivo.AND, vet[i-1], vet[i-2]);
			}
			criacaoFormulas();
		}
		
		System.out.println("-(f)------------------------");
		
	}
	
	private static void criacaoFormulas(){
		IFormula v[] = new IFormula[9];
		v[0] = new FormulaAtomica("A1");
		v[1] = new FormulaAtomica("A2");
		v[2] = new FormulaUnaria(Conectivo.NEGATION, v[0]); //!A1
		v[3] = new FormulaUnaria(Conectivo.NEGATION, new FormulaUnaria(Conectivo.NEGATION, v[1])); //!!A2
		v[4] = new FormulaBinaria(Conectivo.AND, v[0], v[1]); //A1&A2
		v[5] = new FormulaBinaria(Conectivo.AND, v[2], v[1]); //!A1&A2
		v[6] = new FormulaBinaria(Conectivo.OR, v[0], v[3]);//A1||!!A2
		v[7] = new FormulaBinaria(Conectivo.IMPLIES, v[4], v[1]);//(A1&A2)->A2
		
		IFormula f1 = new FormulaBinaria(Conectivo.OR, v[2], new FormulaUnaria(Conectivo.NEGATION, v[1]));
		v[8] = new FormulaBinaria(Conectivo.IMPLIES, v[4], f1); //(A1&A2)->(!A1||!A2)
	}

}