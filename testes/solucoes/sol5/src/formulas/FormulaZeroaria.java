package formulas;

import conectivos.EnumsConectivos;
import conectivos.EnumsConectivos.Conectivo;
import conectivos.EnumsConectivos.TipoConectivo;
import formulas.interfaces.IFormulaZeroaria;

public class FormulaZeroaria implements IFormulaZeroaria {
	private Conectivo _conectivo;
	
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
		return TipoConectivo.zeroario;
	}

	@Override
	public boolean isAtomic() {
		return true;
	}

	public FormulaZeroaria(Conectivo conectivo){
		setConectivo(conectivo);
	}
	
	@Override
	public String toString(){
		return EnumsConectivos.toString(getConectivo());
	}
}
