package formulas;

import conectivos.EnumsConectivos;
import conectivos.EnumsConectivos.Conectivo;
import conectivos.EnumsConectivos.TipoConectivo;
import formulas.interfaces.IFormula;
import formulas.interfaces.IFormulaBinaria;

public class FormulaBinaria implements IFormulaBinaria {
	private Conectivo _conectivo;
	private IFormula _formulaDireita;
	private IFormula _formulaEsquerda;
	
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
		_conectivo = conectivo;
	}
	@Override
	public TipoConectivo getTipoConectivo() {
		return TipoConectivo.binario;
	}
	
	@Override
	public IFormula getFormulaDireita() {
		return _formulaDireita;
	}
	@Override
	public void setFormulaDireita(IFormula formula) {
		_formulaDireita = formula;
	}
	
	@Override
	public IFormula getFormulaEsquerda() {
		return _formulaEsquerda;
	}
	@Override
	public void setFormulaEsquerda(IFormula formula) {
		_formulaEsquerda = formula;
	}
	
	@Override
	public boolean isAtomic() {
		return false;
	}

	public FormulaBinaria(Conectivo conectivo, IFormula formulaEsquerda, IFormula formulaDireita){
		setConectivo(conectivo);
		setFormulaDireita(formulaDireita);
		setFormulaEsquerda(formulaEsquerda);
	}
	
	@Override
	public String toString(){
		return getFormulaEsquerda().toString() + EnumsConectivos.toString(getConectivo()) +  getFormulaDireita().toString();
	}
}
