package conectivos;

import enuns.ClsEnuns.TipoConectivo;

/**
 * Interface Conectivo
 * */
public interface IConectivo {
	public void setIdentificador(short identificador);
	public short getIdentificador();
	public int getAridade();
	public TipoConectivo getTipoConectivo(); //se bem que ja existe a aridade...
}