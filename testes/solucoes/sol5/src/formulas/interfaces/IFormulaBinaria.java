package formulas.interfaces;

import conectivos.EnumsConectivos.Conectivo;
import conectivos.EnumsConectivos.TipoConectivo;

public interface IFormulaBinaria extends IFormula {
	public void setConectivo(Conectivo conectivo);
	public Conectivo getConectivo();
	public short getAridade();
	public TipoConectivo getTipoConectivo(); //se bem que ja existe a aridade...
	
	public void setFormulaEsquerda(IFormula formula);
	public IFormula getFormulaEsquerda();
	public void setFormulaDireita(IFormula formula);
	public IFormula getFormulaDireita();
}