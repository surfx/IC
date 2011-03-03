package conectivos;

import enuns.clsEnuns.TipoConectivo;

/**
 * Respresenta um conectivoZeroario
 * */
public class conectivoZeroario implements IConectivo {
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
	
	public conectivoZeroario(String identificador){
		setIdentificador(identificador);
	}

}
