package conectivos;

import java.util.LinkedList;
import formulas.IFormula;

/**
 * Interface Conectivo
 * */
public interface IConectivo {
	public void setIdentificador(String identificador);
	public String getIdentificador();
	public int getAridade();
	public void addFormula(IFormula formula);
	public LinkedList<IFormula> getFormulas();
}