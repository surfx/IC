
public class main {

	public static void main(String[] args) {
		
		//como se fosse um parse de uma string para um short
		repositorioIdentificadores r = new repositorioIdentificadores();
		short indice1 = r.adicionarIdentificador("A");
		short indice2 = r.adicionarIdentificador("B");
		short indice3 = r.adicionarIdentificador("A");
		short indice4 = r.adicionarIdentificador("C");
		
		System.out.println("indice1 '"+r.getIdentificador(indice1)+"': " + indice1); //0
		System.out.println("indice2 '"+r.getIdentificador(indice2)+"': " + indice2); //1
		System.out.println("indice3 '"+r.getIdentificador(indice3)+"': " + indice3); //0
		System.out.println("indice4 '"+r.getIdentificador(indice4)+"': " + indice4); //2
		
	}

}
