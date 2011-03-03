package formulas;

import conectivos.IConectivo;

/**
 * Representa uma fórmula composta
 * */
public class formulaComposta implements IFormulaComposta {
	
	private IConectivo _iconectivo; 
	
	@Override
	public boolean isAtomic(){
		return false; //melhor forma de se fazer isto ?
	}
	@Override
	public IConectivo getConectivo() {
		return _iconectivo;
	}
	@Override
	public void setConectivo(IConectivo conectivo) {
		_iconectivo = conectivo;
	}
	
	public formulaComposta(){
		
	}

	public formulaComposta(IConectivo conectivo){
		setConectivo(conectivo);
	}

}
