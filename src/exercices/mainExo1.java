package exercices;

public class mainExo1 {
	
	
    		 
	public static void main(String[] args ){
		PairVsImpair a = new PairVsImpair();
		PairVsImpair b = new PairVsImpair();
	
		int A = a.getA();
		int B = b.getB();
		int B1 = b.setB(0); // recuperer le nombre 
		if (A%2==0){
		System.out.println("A = "+A+"\tdonc A c'est un nombre pair ");
		}
		else 
			System.out.println("A = "+A +"\t donc A c est un nombre impair");
		if (B%2==0){
			System.out.println("B = "+B+" donc B c'est un nombre pair ");
			}
			else 
				System.out.println("B="+B+"donc B c'est un nombre impair");
		if (B1%2==0){
			System.out.println("B1 C'est nombre pair ");
			}
			else 
				System.out.println("B1 C'est un nombre impair");
	}
}
