package conectivos;

import enuns.ClsEnuns.TipoConectivo;

/**
 * Representa um ConectivoZeroario
 * */
public class ConectivoZeroario implements IConectivo {
	private short _identificador;
	
	@Override
	public int getAridade() {
		return 0;
	}
	@Override
	public TipoConectivo getTipoConectivo() {
		return TipoConectivo.zeroario;
	}
	
	@Override
	public void setIdentificador(short identificador) {
		_identificador = identificador;
	}
	@Override
	public short getIdentificador() {
		return _identificador;
	}
	
	public ConectivoZeroario(short identificador){
		setIdentificador(identificador);
	}

}
