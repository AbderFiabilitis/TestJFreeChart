package revision;

public class Main {

	public static void main(String[] args){
		Ville ville = new Ville();
		System.out.println("le nombre d'instance de la classe Ville est : "+ville.nbreInstances);
		System.out.println("le nombre d'instance de la classe Ville est : "+ville.getNombreInstancesBis());
		Ville ville1 = new Ville("Marseille","FRANCE",250000); // respecter l'ordre de paramétres
		System.out.println("le nombre d'instance de la classe Ville est : "+ville1.nbreInstances);
		System.out.println("le nombre d'instance de la classe Ville est : "+ville1.getNombreInstancesBis());
		Ville ville2 = new Ville("Gafsa" , "TUNISIE", 120000);
		System.out.println("le nombre d'instance de la classe Ville est : "+ville2.nbreInstances);
		System.out.println("le nombre d'instance de la classe Ville est : "+ville2.getNombreInstancesBis());
		Ville ville3 = new Ville ("Rio","BRESIL",58200);
		System.out.println("le nombre d'instance de la classe Ville est : "+ville3.nbreInstances);
		System.out.println("le nombre d'instance de la classe Ville est : "+ville3.getNombreInstancesBis());

		int a1 = ville1.getNbreHabitants();
		String monVille1 = ville1.getNomVille();
		String monPays1 = ville1.getNomPays();
		
		int a2 = ville2.getNbreHabitants();
		String monVille2 = ville2.getNomVille();
		String monPays2 = ville2.getNomPays();
		
		int a3 = ville3.getNbreHabitants();
		String monVille3 = ville3.getNomVille();
		String monPays3 = ville3.getNomPays();

		System.out.println("Ville1 : "+a1 +"\t"+monVille1+"\t" +monPays1 );
		System.out.println("Ville2 :"+a2 +"\t"+monVille2+"\t" +monPays2 );
		System.out.println("Ville3 :"+a3 +"\t"+monVille3+"\t" +monPays3 );	}
}
