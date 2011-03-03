
import java.util.LinkedList;

public class repositorioIdentificadores {
	private LinkedList<String> _lista = new LinkedList<String>();
	
	public short adicionarIdentificador(String identificador){
		short rt = getIndiceIdentificador(identificador);
		if (rt < 0) {
			_lista.add(identificador);
			rt = (short) (_lista.size()-1); //como adicionou no fim mesmo...
		}
		return rt;
	}
	
	public short getIndiceIdentificador(String identificador){
		short rt = 0;
		for (String s : _lista ){
			if (s.equals(identificador)) {
				return rt;
			}
			rt++;
		}
		return -1;//não achou
	}
	
	public String getIdentificador(int indice){
		return _lista.get(indice);
	}
	
	public repositorioIdentificadores(){}
	public repositorioIdentificadores(String identificador){
		_lista.add(identificador);
	}
	
}