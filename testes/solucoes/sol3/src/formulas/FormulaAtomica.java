package formulas;

/**
 * Representa uma formula atomica
 * */
public class FormulaAtomica implements IFormulaAtomica {

	private String _identificador;
	
	@Override
	public boolean isAtomic(){
		return true; //melhor forma de se fazer isto ?
	}
	@Override
	public void setIdentificador(String identificador) {
		_identificador = identificador;
	}
	@Override
	public String getIdentificador() {
		return _identificador;
	}
	
	public FormulaAtomica(String identificador){
		setIdentificador(identificador);
	}
	
}
