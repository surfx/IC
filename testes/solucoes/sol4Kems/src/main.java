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
			System.out.println(vet[i]);
		}
		System.out.println("-(f)------------------------");
	}

}