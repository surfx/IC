package conectivos;

public class EnumsConectivos {
	public enum TipoConectivo {
		zeroario,
		unario,
		binario
	}
	
	public enum Conectivo {
		TOP,
		BOTTOM,
		CONSYSTENCY,
		AND,
		OR,
		XOR,
		NEGATION,
		IMPLIES
	}
	
	public static short getAridade(TipoConectivo tc){
		switch (tc){
			case zeroario: return 0;
			case unario: return 1;
			case binario: return 2;
			
			default: return -1;
		}
	}
	
	public static short getAridade(Conectivo c){
		switch (c){
			case TOP: return 0;
			case BOTTOM: return 0;
			case CONSYSTENCY: return 1;
			case AND: return 2;
			case OR: return 2;
			case XOR: return 2;
			case NEGATION: return 1;
			case IMPLIES: return 2;
			
			default: return -1;
		}
	}
	
	public static String toString(Conectivo c){
		switch (c){
			case TOP: return "TOP";
			case BOTTOM: return "BOTTOM";
			case CONSYSTENCY: return "°";
			case AND: return "&";
			case OR: return "||";
			case XOR: return "XOR";
			case NEGATION: return "!";
			case IMPLIES: return "->";
			
			default: return "";
		}
	}
}
