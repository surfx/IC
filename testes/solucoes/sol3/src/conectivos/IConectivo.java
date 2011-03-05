package conectivos;

import enuns.ClsEnuns.TipoConectivo;

/**
 * Interface Conectivo
 * */
public interface IConectivo {
	public void setIdentificador(String identificador);
	public String getIdentificador();
	public int getAridade();
	public TipoConectivo getTipoConectivo(); //se bem que ja existe a aridade...
}