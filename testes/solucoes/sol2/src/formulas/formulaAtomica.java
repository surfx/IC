package formulas;

/**
 * Representa uma fórmula atômica
 * */
public class formulaAtomica implements IFormulaAtomica {

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
	
	public formulaAtomica(String identificador){
		setIdentificador(identificador);
	}
	
}
