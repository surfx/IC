package conectivos;

import enuns.clsEnuns.TipoConectivo;
import formulas.IFormula;

public class conectivoUnario implements IConectivoUnario {
	private String _identificador;
	private IFormula _formula;
	
	@Override
	public int getAridade() {
		return 1;
	}
	@Override
	public TipoConectivo getTipoConectivo() {
		return TipoConectivo.unario;
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
	public IFormula getFormula() {
		return _formula;
	}

	@Override
	public void setFormula(IFormula formula) {
		_formula = formula;
	}
	
	public conectivoUnario(String identificador){
		setIdentificador(identificador);
		setFormula(null);
	}

	public conectivoUnario(String identificador, IFormula formula){
		setIdentificador(identificador);
		setFormula(formula);
	}



}
