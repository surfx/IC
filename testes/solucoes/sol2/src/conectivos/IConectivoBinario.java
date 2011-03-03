package conectivos;

import formulas.IFormula;

public interface IConectivoBinario extends IConectivo {
	public void setFormulaEsquerda(IFormula formula);
	public IFormula getFormulaEsquerda();
	public void setFormulaDireita(IFormula formula);
	public IFormula getFormulaDireita();
}
