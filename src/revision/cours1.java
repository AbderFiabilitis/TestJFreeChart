package revision;

import java.util.Random;

public class cours1 {
	/* les programme java sont compilés en byte code. compréhensibale que
	 * par JVM 
	 * JDK : java SE Development Kit
	 */
	
	
	/* Variables*/
	/* déclaraton générale : 
	 *       type de variable    nom de variable 
	 *      
	 */
	int A = 2 ; 
	double B = 2.0; 
	float pi =3.14159f;
	String Chaine = "Chaine";
	boolean question = true;
	public static void main(String[] args){
		System.out.println("test de cours 1");
		System.out.println("\n sauter une ligne");
		System.out.println("\t faire une tabulation");
	
		
		/*
		 * Convertir d'un type a un autre  avec Cast
		 */
		//Exemple1 conversion d'ajustement ( cast de variable) 
		int i = 123;
		double j = (double)i;
		System.out.println("j :"+j+"\ti :"+i);
		// inversement 
		double i2 =1.23;
		double j2 = 152.999999;
		int k1 = (int)i2;
		int k2 =(int)j2;
		System.out.println("k1 : "+k1 +"\tk2 :"+k2);
	/*
	 * Les condition 
	 */
	// 1] if ... else 
		for (int m =0; m <10;m++){
		Random r = new Random();
		
		int max =10 ;
		int min = 0;
	int a = r.nextInt(max - min);
	System.out.println("a="+a);
		if(a > 5){
			System.out.println(i+"le nombre choisie est suupérieur à 5 donc Gagner");
			
		}
		else
			System.out.println(i+"le nombre choisit est inférieur à 5 donc Perdu");
	}
	}
}
