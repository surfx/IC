import conectivos.Conectivo;
import conectivos.IConectivo;
import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormula;


public class main {

	public static void main(String[] args) {
		//formulas
//		IFormulaAtomica fa1 = new FormulaAtomica("A1");
//		IFormulaAtomica fa2 = new FormulaAtomica("A2");
//		
//		IConectivo conec = new Conectivo("&");
//		conec.addFormula(fa1);
//		conec.addFormula(fa2);
//		
//		IFormulaComposta fc = new FormulaComposta(conec);

		
		System.out.println("-(i)------------------------");
		IFormula vet[] = new IFormula[1000000];
		IConectivo conec;
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = new FormulaAtomica("A" + i);
			} else {
				conec = new Conectivo("&");
				conec.addFormula(vet[i-1]);
				conec.addFormula(vet[i-2]);
				vet[i] = new FormulaComposta(conec);
			}
		}
		System.out.println("-(f)------------------------");
	}

}