import repositorio.RepositorioIdentificadores;
import conectivos.ConectivoBinario;
import conectivos.ConectivoUnario;
import conectivos.ConectivoZeroario;
import conectivos.IConectivo;
import enuns.ClsEnuns.TipoConectivo;
import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormula;

/*
formulas:
		IFormulaAtomica fA1 = new FormulaAtomica("A1");
		IFormulaAtomica fA2 = new FormulaAtomica("A2");
		IConectivo cZ = new ConectivoZeroario("TOP");
		IConectivo cUnario = new ConectivoUnario("!", fA1);
		IConectivo cB = new ConectivoBinario("&", fA1, fA2);
		
		IFormulaComposta fComposta = new FormulaComposta(cB);
		IConectivo cB2 = new ConectivoBinario("||", fComposta, fComposta);
		IFormulaComposta fComposta2 = new FormulaComposta(cB2);
*/
public class FormulaFactory {
	public static RepositorioIdentificadores Repositorio = new RepositorioIdentificadores();
	
	public static String getIdentificador(short indice){
		return Repositorio.getIdentificador(indice);
	}
	
	public static FormulaAtomica getFormula(String identificador){
		return new FormulaAtomica(Repositorio.adicionarIdentificador(identificador));
	}
	public static FormulaComposta getFormula(IConectivo conectivo){
		return new FormulaComposta(conectivo);
	}
	public static IConectivo getConectivo(TipoConectivo tp, String identificador){
		switch (tp){
			case binario:
				return new ConectivoBinario(Repositorio.adicionarIdentificador(identificador));
			case unario:
				return new ConectivoUnario(Repositorio.adicionarIdentificador(identificador));
			case zeroario:
				return new ConectivoZeroario(Repositorio.adicionarIdentificador(identificador));
		}
		return null;
	}
	public static FormulaComposta getFormulaComposta(TipoConectivo tp, String identificador){
		return new FormulaComposta(getConectivo(tp, identificador));
	}
	public static FormulaComposta getFormulaComposta(ConectivoZeroario con, String identificador){
		con.setIdentificador(Repositorio.adicionarIdentificador(identificador));
		return new FormulaComposta(con);
	}
	public static FormulaComposta getFormulaComposta(ConectivoUnario con, IFormula f){
		con.setFormula(f);
		return new FormulaComposta(con);
	}
	public static FormulaComposta getFormulaComposta(ConectivoBinario con, IFormula fD, IFormula fE){
		con.setFormulaDireita(fD);
		con.setFormulaEsquerda(fE);
		return new FormulaComposta(con);
	}
}
