package conectivos;

import enuns.clsEnuns.TipoConectivo;

/**
 * Interface Conectivo
 * */
public interface IConectivo {
	public void setIdentificador(String identificador);
	public String getIdentificador();
	public int getAridade();
	public TipoConectivo getTipoConectivo(); //se bem que já existe a aridade...
}