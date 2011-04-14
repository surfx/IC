import formulas.Arity;
import formulas.Connective;
import formulas.Formula;
import formulas.FormulaFactory;


public class main {

	public static void main(String[] args) {
		
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
		Formula vet[] = new Formula[numFormulas];
		FormulaFactory ff = new FormulaFactory();
		Connective c= new Connective("&", Arity.BINARY);
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = ff.createAtomicFormula("A" + i);
			} else {
				vet[i] = ff.createCompositeFormula(c, vet[i-1], vet[i-2]);
			}
			//criacaoFormulas();
		}
		System.out.println("-(f)------------------------");
		
	    System.out.println("Total Memory: "+Runtime.getRuntime().totalMemory());    
	    System.out.println("Free Memory: "+Runtime.getRuntime().freeMemory());
		
	    double memoriaEmUso2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    //System.out.println("memoriaEmUso2: "+memoriaEmUso2);
	    System.out.println("memoriaUsada: "+ (memoriaEmUso2-memoriaEmUso1));
		
	}
	private static void criacaoFormulas(){
		Formula v[] = new Formula[9];
		FormulaFactory ff = new FormulaFactory();
		v[0] = ff.createAtomicFormula("A1");
		v[1] = ff.createAtomicFormula("A2");
		v[2] = ff.createCompositeFormula(new Connective("!",Arity.UNARY), v[0]); //!A1
		v[3] = ff.createCompositeFormula(new Connective("!",Arity.UNARY), ff.createCompositeFormula(new Connective("!", Arity.UNARY), v[1])); //!!A2
		v[4] = ff.createCompositeFormula(new Connective("&", Arity.BINARY), v[0], v[1]); //A1&A2
		v[5] = ff.createCompositeFormula(new Connective("&", Arity.BINARY), v[2], v[1]); //!A1&A2
		v[6] = ff.createCompositeFormula(new Connective("||", Arity.BINARY), v[0], v[3]);//A1||!!A2
		v[7] = ff.createCompositeFormula(new Connective("->", Arity.BINARY), v[4], v[1]);//(A1&A2)->A2
		
		Formula f1 = ff.createCompositeFormula(new Connective("||", Arity.BINARY), v[2], ff.createCompositeFormula(new Connective("!", Arity.UNARY), v[1]));
		v[8]=ff.createCompositeFormula(new Connective("->", Arity.BINARY), v[4], f1); //(A1&A2)->(!A1||!A2)
	}
}