import conectivos.ConectivoBinario;
import conectivos.ConectivoUnario;
import conectivos.ConectivoZeroario;
import conectivos.IConectivo;
import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormula;
import formulas.IFormulaAtomica;
import formulas.IFormulaComposta;
import repositorio.RepositorioIdentificadores;

public class main {

	public static void main(String[] args) {
/*		//como se fosse um parse de uma string para um short
		RepositorioIdentificadores r = new RepositorioIdentificadores();
		short indice1 = r.adicionarIdentificador("A");
		short indice2 = r.adicionarIdentificador("B");
		short indice3 = r.adicionarIdentificador("A");
		short indice4 = r.adicionarIdentificador("C");
		
		System.out.println("indice1 '"+r.getIdentificador(indice1)+"': " + indice1); //0
		System.out.println("indice2 '"+r.getIdentificador(indice2)+"': " + indice2); //1
		System.out.println("indice3 '"+r.getIdentificador(indice3)+"': " + indice3); //0
		System.out.println("indice4 '"+r.getIdentificador(indice4)+"': " + indice4); //2*/
		
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