package formulas;

import conectivos.IConectivo;

/**
 * Interface de uma f�rmula composta
 * */
public interface IFormulaComposta extends IFormula {
	public void setConectivo(IConectivo conectivo);
	public IConectivo getConectivo();
}