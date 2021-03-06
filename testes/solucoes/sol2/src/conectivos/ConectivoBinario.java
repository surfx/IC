package conectivos;

import enuns.ClsEnuns.TipoConectivo;
import formulas.IFormula;

public class ConectivoBinario implements IConectivoBinario {
	private String _identificador;
	private IFormula _formulaDireita;
	private IFormula _formulaEsquerda;
	
	@Override
	public int getAridade() {
		return 2;
	}
	@Override
	public TipoConectivo getTipoConectivo() {
		return TipoConectivo.binario;
	}
	
	@Override
	public void setIdentificador(String identificador) {
		_identificador = identificador;
	}
	@Override
	public String getIdentificador() {
		return _identificador;
	}

	@Override
	public IFormula getFormulaDireita() {
		return _formulaDireita;
	}

	@Override
	public IFormula getFormulaEsquerda() {
		return _formulaEsquerda;
	}

	@Override
	public void setFormulaDireita(IFormula formula) {
		_formulaDireita = formula;
	}

	@Override
	public void setFormulaEsquerda(IFormula formula) {
		_formulaEsquerda = formula;
	}

	public ConectivoBinario(String identificador){
		setIdentificador(identificador);
		setFormulaEsquerda(null);
		setFormulaDireita(null);
	}
	public ConectivoBinario(String identificador, IFormula formulaEsquerda, IFormula formulaDireita){
		setIdentificador(identificador);
		setFormulaEsquerda(formulaEsquerda);
		setFormulaDireita(formulaDireita);
	}
	
}
