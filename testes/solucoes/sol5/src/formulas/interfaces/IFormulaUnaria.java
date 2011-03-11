package formulas.interfaces;

import conectivos.EnumsConectivos.Conectivo;
import conectivos.EnumsConectivos.TipoConectivo;

public interface IFormulaUnaria extends IFormula {
	public void setConectivo(Conectivo conectivo);
	public Conectivo getConectivo();
	public short getAridade();
	public TipoConectivo getTipoConectivo(); //se bem que ja existe a aridade...
	
	public void setFormula(IFormula formula);
	public IFormula getFormula();
}