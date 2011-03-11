import conectivos.ConectivoBinario;
import conectivos.ConectivoUnario;
import conectivos.ConectivoZeroario;
import conectivos.IConectivo;
import enuns.ClsEnuns.TipoConectivo;
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
/*		
		//Factory
		FormulaAtomica fa = FormulaFactory.getFormula("A1");
		//fa: 0 - A1
		System.out.println("fa: " + fa.getIdentificador() + " - " +  FormulaFactory.getIdentificador(fa.getIdentificador()));
		
		FormulaComposta fc = FormulaFactory.getFormulaComposta((ConectivoBinario) FormulaFactory.getConectivo(TipoConectivo.binario, "||"), fa, fa);
	    //fc: 1 - ||
		System.out.println("fc: " + fc.getConectivo().getIdentificador() + " - " + FormulaFactory.getIdentificador(fc.getConectivo().getIdentificador()));
*/
		System.out.println("-(i)------------------------");
		IFormula vet[] = new IFormula[1000000];
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = FormulaFactory.getFormula("A" + i);
			} else {
				vet[i] = FormulaFactory.getFormulaComposta((ConectivoBinario) FormulaFactory.getConectivo(TipoConectivo.binario, "||"), vet[i-1], vet[i-2]);
			}
		}
		System.out.println("-(f)------------------------");
	}
	
	private static void criacaoFormulas(){
		IFormula v[] = new IFormula[9];
		v[0] = FormulaFactory.getFormula("A1");
		v[1] = FormulaFactory.getFormula("A2");
		v[2] = FormulaFactory.getFormulaComposta((ConectivoUnario)FormulaFactory.getConectivo(TipoConectivo.unario, "!"), v[0]); //!A1
		v[3] = FormulaFactory.getFormulaComposta((ConectivoUnario)FormulaFactory.getConectivo(TipoConectivo.unario, "!"), FormulaFactory.getFormulaComposta((ConectivoUnario)FormulaFactory.getConectivo(TipoConectivo.unario,"!"), v[1])); //!!A2
		v[4] = FormulaFactory.getFormulaComposta((ConectivoBinario)FormulaFactory.getConectivo(TipoConectivo.binario, "&"), v[0], v[1]); //A1&A2
		v[5] = FormulaFactory.getFormulaComposta((ConectivoBinario)FormulaFactory.getConectivo(TipoConectivo.binario,"&"), v[2], v[1]); //!A1&A2
		v[6] = FormulaFactory.getFormulaComposta((ConectivoBinario)FormulaFactory.getConectivo(TipoConectivo.binario,"||"), v[0], v[3]);//A1||!!A2
		v[7] = FormulaFactory.getFormulaComposta((ConectivoBinario)FormulaFactory.getConectivo(TipoConectivo.binario,"->"), v[4], v[1]);//(A1&A2)->A2
		
		IFormula f1 = FormulaFactory.getFormulaComposta((ConectivoBinario)FormulaFactory.getConectivo(TipoConectivo.binario,"||"), v[2], FormulaFactory.getFormulaComposta((ConectivoUnario)FormulaFactory.getConectivo(TipoConectivo.unario, "!"), v[1]));
		v[8] = FormulaFactory.getFormulaComposta((ConectivoBinario)FormulaFactory.getConectivo(TipoConectivo.binario,"->"), v[4], f1); //(A1&A2)->(!A1||!A2)
	}
	
}