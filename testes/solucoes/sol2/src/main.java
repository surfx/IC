import conectivos.ConectivoBinario;
import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormula;


public class main {

	public static void main(String[] args) {
		//formulas
//		IFormulaAtomica fA1 = new FormulaAtomica("A1");
//		IFormulaAtomica fA2 = new FormulaAtomica("A2");
//		IConectivo cZ = new ConectivoZeroario("TOP");
//		IConectivo cUnario = new ConectivoUnario("!", fA1);
//		IConectivo cB = new ConectivoBinario("&", fA1, fA2);
//		
//		IFormulaComposta fComposta = new FormulaComposta(cB);
//		IConectivo cB2 = new ConectivoBinario("||", fComposta, fComposta);
//		IFormulaComposta fComposta2 = new FormulaComposta(cB2);
		
		System.out.println("-(i)------------------------");
		IFormula vet[] = new IFormula[1000000];
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = new FormulaAtomica("A" + i);
			} else {
				vet[i] = new FormulaComposta(new ConectivoBinario("||", vet[i-1], vet[i-2]));
			}
		}
		System.out.println("-(f)------------------------");
	}

}