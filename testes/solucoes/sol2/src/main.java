import conectivos.ConectivoBinario;
import conectivos.ConectivoUnario;
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
			criacaoFormulas();
		}
		System.out.println("-(f)------------------------");
	}
	
	private static void criacaoFormulas(){
		IFormula v[] = new IFormula[9];
		v[0] = new FormulaAtomica("A1");
		v[1] = new FormulaAtomica("A2");
		v[2] = new FormulaComposta(new ConectivoUnario("!", v[0])); //!A1
		v[3] = new FormulaComposta(new ConectivoUnario("!", new FormulaComposta(new ConectivoUnario("!", v[1])))); //!!A2
		v[4] = new FormulaComposta(new ConectivoBinario("&", v[0], v[1])); //A1&A2
		v[5] = new FormulaComposta(new ConectivoBinario("&", v[2], v[1])); //!A1&A2
		v[6] = new FormulaComposta(new ConectivoBinario("||", v[0], v[3]));//A1||!!A2
		v[7] = new FormulaComposta(new ConectivoBinario("->", v[4], v[1]));//(A1&A2)->A2
		
		IFormula f1 = new FormulaComposta(new ConectivoBinario("||", v[2], new FormulaComposta(new ConectivoUnario("!", v[1]))));
		v[8]=new FormulaComposta(new ConectivoBinario("->", v[4], f1)); //(A1&A2)->(!A1||!A2)
	}
}