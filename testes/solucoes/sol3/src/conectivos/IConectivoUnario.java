package conectivos;

import formulas.IFormula;

public interface IConectivoUnario extends IConectivo {
	public void setFormula(IFormula formula);
	public IFormula getFormula();
}
