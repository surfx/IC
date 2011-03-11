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

		
		System.out.println("-(i)------------------------");
		IFormula vet[] = new IFormula[1000000];
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
		
		//Esta solução não é prática para criar fórmulas, por isto não continuei
		
	}

}