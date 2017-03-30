package exercices;

import java.util.Scanner;

public class PairVsImpair {
	 
	 private static Scanner scanner = new Scanner(System.in);
	private int a =10; 
	private int b =25;
	
	// constructeur par defaut 
	public PairVsImpair(){
		
	}
	public  PairVsImpair(int A , int B, Scanner number ){
	this.scanner = number;	
	System.out.println("entrer un nombre");
	 int n = scanner.nextInt();
	this.a = A;
	this.b = B; 
		
	}
	
	
	// accesseurs et mutatteurs
	public int getA(){
		return a;
	}
	public void setA(int A){
		this.a =A;
	}
	public int getB(){
		return b; 
	}
	public int setB(int B){
		return this.b = B; 
	}
	
}

