package formulas;

/**
 * Representa uma formula atomica
 * */
public class FormulaAtomica implements IFormulaAtomica {

	private short _identificador;
	
	@Override
	public boolean isAtomic(){
		return true; //melhor forma de se fazer isto ?
	}
	@Override
	public void setIdentificador(short identificador) {
		_identificador = identificador;
	}
	@Override
	public short getIdentificador() {
		return _identificador;
	}
	
	public FormulaAtomica(short identificador){
		setIdentificador(identificador);
	}
	
}
