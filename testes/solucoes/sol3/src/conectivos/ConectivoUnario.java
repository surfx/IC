package conectivos;

import enuns.ClsEnuns.TipoConectivo;
import formulas.IFormula;

public class ConectivoUnario implements IConectivoUnario {
	private short _identificador;
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
	public void setIdentificador(short identificador) {
		_identificador = identificador;
	}
	@Override
	public short getIdentificador() {
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
	
	public ConectivoUnario(short identificador){
		setIdentificador(identificador);
		setFormula(null);
	}

	public ConectivoUnario(short identificador, IFormula formula){
		setIdentificador(identificador);
		setFormula(formula);
	}



}
