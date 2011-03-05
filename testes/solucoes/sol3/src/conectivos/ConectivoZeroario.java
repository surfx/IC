package conectivos;

import enuns.ClsEnuns.TipoConectivo;

/**
 * Representa um ConectivoZeroario
 * */
public class ConectivoZeroario implements IConectivo {
	private String _identificador;
	
	@Override
	public int getAridade() {
		return 0;
	}
	@Override
	public TipoConectivo getTipoConectivo() {
		return TipoConectivo.zeroario;
	}
	
	@Override
	public void setIdentificador(String identificador) {
		_identificador = identificador;
	}
	@Override
	public String getIdentificador() {
		return _identificador;
	}
	
	public ConectivoZeroario(String identificador){
		setIdentificador(identificador);
	}

}
