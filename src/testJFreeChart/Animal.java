package testJFreeChart;

	abstract class Animal{
		protected String couleur; 
		protected int poids; 
		protected void manger(){
			System.out.println(" je mange de la viande");
		}
		protected void boire(){
			System.out.println("je bois l'eau");
		}
		abstract void deplacement();
		abstract void crier();
	}


