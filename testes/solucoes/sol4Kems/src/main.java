import formulas.Arity;
import formulas.Connective;
import formulas.Formula;
import formulas.FormulaFactory;


public class main {

	public static void main(String[] args) {
		System.out.println("-(i)------------------------");
		Formula vet[] = new Formula[1000000];
		FormulaFactory ff = new FormulaFactory();
		Connective c= new Connective("&", Arity.BINARY);
		for (int i = 0; i < vet.length; i++){
			if (i < 2){
				vet[i] = ff.createAtomicFormula("A" + i);
			} else {
				vet[i] = ff.createCompositeFormula(c, vet[i-1], vet[i-2]);
			}
		}
		System.out.println("-(f)------------------------");
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