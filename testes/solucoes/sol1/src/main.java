import conectivos.Conectivo;
import conectivos.IConectivo;
import formulas.FormulaAtomica;
import formulas.FormulaComposta;
import formulas.IFormula;


public class main {

	public static void main(String[] args) {
		//formulas
//		IFormulaAtomica fa1 = new FormulaAtomica("A1");
//		IFormulaAtomica fa2 = new FormulaAtomica("A2");
//		
//		IConectivo conec = new Conectivo("&");
//		conec.addFormula(fa1);
//		conec.addFormula(fa2);
//		
//		IFormulaComposta fc = new FormulaComposta(conec);

		int numFormulas = 1000000;
		if (args.length > 0){
			try {
			numFormulas = Integer.parseInt(args[0]);
			} catch(Exception e) {
				numFormulas = 1000000;
			}
		}
		
		System.out.println("numFormulas: "+ numFormulas);
	    double memoriaEmUso1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    
	    
		System.out.println("-(i)------------------------");
		IFormula vet[] = new IFormula[numFormulas];
		IConectivo conec;
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = new FormulaAtomica("A" + i);
			} else {
				conec = new Conectivo("&");
				conec.addFormula(vet[i-1]);
				conec.addFormula(vet[i-2]);
				vet[i] = new FormulaComposta(conec);
			}
		}
		System.out.println("-(f)------------------------");
		
	    System.out.println("Total Memory: "+Runtime.getRuntime().totalMemory());    
	    System.out.println("Free Memory: "+Runtime.getRuntime().freeMemory());
		
	    double memoriaEmUso2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    //System.out.println("memoriaEmUso2: "+memoriaEmUso2);
	    System.out.println("memoriaUsada: "+ (memoriaEmUso2-memoriaEmUso1));
		
	}
	
	private static void criacaoFormulas(){
		IFormula v[] = new IFormula[10];
		v[0] = new FormulaAtomica("A1");
		v[1] = new FormulaAtomica("A2");
		
		IConectivo c1 = new Conectivo("!");
		c1.addFormula(v[0]);
		v[2] =new FormulaComposta(c1); //!A1
		
		IConectivo c2 = new Conectivo("!");
		IConectivo c3 = new Conectivo("!");
		c3.addFormula(v[1]);
		c2.addFormula(new FormulaComposta(c3));
		v[3] = new FormulaComposta(c2); //!!A2
		
		IConectivo c4 = new Conectivo("&");
		c4.addFormula(v[0]);
		c4.addFormula(v[1]);
		v[4] = new FormulaComposta(c4); //A1&A2
		
		//Esta solu��o n�o � pr�tica para criar f�rmulas, por isto n�o continuei
		
	}

}