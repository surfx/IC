package formulas;

import conectivos.EnumsConectivos;
import conectivos.EnumsConectivos.Conectivo;
import conectivos.EnumsConectivos.TipoConectivo;
import formulas.interfaces.IFormula;
import formulas.interfaces.IFormulaUnaria;

public class FormulaUnaria implements IFormulaUnaria {
	private Conectivo _conectivo;
	private IFormula _formula;
	
	@Override
	public short getAridade() {
		return EnumsConectivos.getAridade(getTipoConectivo());
	}

	@Override
	public Conectivo getConectivo() {
		return _conectivo;
	}
	@Override
	public void setConectivo(Conectivo conectivo) {
		this._conectivo = conectivo;
	}
	
	@Override
	public IFormula getFormula() {
		return _formula;
	}
	@Override
	public void setFormula(IFormula formula) {
		this._formula = formula;
	}
	
	@Override
	public TipoConectivo getTipoConectivo() {
		return TipoConectivo.unario;
	}
	
	@Override
	public boolean isAtomic() {
		return false;
	}
	
	public FormulaUnaria(Conectivo conectivo, IFormula formula){
		setConectivo(conectivo);
		setFormula(formula);
	}
	
	@Override
	public String toString(){
		return EnumsConectivos.toString(getConectivo()) + getFormula().toString();
	}
}
