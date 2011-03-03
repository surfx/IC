package conectivos;

import java.util.LinkedList;

import formulas.IFormula;

/**
 * Respresenta um conectivo
 * */
public class conectivo implements IConectivo {
	private String _identificador;
	private LinkedList<IFormula> _listaFormulas = null;
	
	@Override
	public int getAridade() {
		return getFormulas() == null ? 0 : getFormulas().size();
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
	public void addFormula(IFormula formula) {
		//desta forma só cria a linked list caso existam subformulas - economia de memória
		if (_listaFormulas == null) _listaFormulas = new LinkedList<IFormula>();
		_listaFormulas.add(formula);
	}

	@Override
	public LinkedList<IFormula> getFormulas() {
		return _listaFormulas;
	}
	
	public conectivo(String identificador){
		setIdentificador(identificador);
	}

}
