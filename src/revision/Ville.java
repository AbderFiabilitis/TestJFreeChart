package revision;

public class Ville {
// stocke le nom de la ville
	private String nomVille;
// stocke le nom de pays
	private String nomPays;
// stocke le nombre d'habitant 
	private int nbreHabitants;
// variable publiques qui comptent les instances
	public static int nbreInstances =0 ;
// variable privé qui comptent les instances 
	private static int nbreInstancesBis =0;
	
	//constructeur par défaut
	public Ville(){
		// on incrémente nos variables à chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		System.out.println("Création d'une ville !");
		nomVille = "inconnue";
		nomPays = "inconnue";
		
	}
	// constructeur avec paramétres ( 3 paramétre de meme type que dans la déclaration)
	public Ville(String pNom , String pPays, int pNbre){
		
		nomVille = pNom; 
		nomPays = pPays;
		setNbreHabitants(pNbre);
		// on incrémente nos variables à chaque appel aux constructeurs 
		nbreInstances++;
		nbreInstancesBis++;
	}
	//*****************Accesseurs******************************
	public int getNbreHabitants() {
		return nbreHabitants;
	}
	//**********************Mettateurs********************
	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}
	
	public String getNomVille(){
		return nomVille;
	}
	
	public void setNomVille(String pVille){
		this.nomVille = pVille;
	}
	
	public String getNomPays(){
		return nomPays;
	}
	
	public void setNomPays(String pPays){
		this.nomPays =pPays;
	}
	 
	// accesseur pour récuperer le nombre d'instance en mode private
	
	public static int getNombreInstancesBis(){
		return nbreInstancesBis;
	}
	
	/*
	 * les constructeurs : méthodes servent à créer des objets
	 * les accesseurs : méthodes servent à accéder aux données des dobjets 
	 * les méthodes d'instance : méthodes servent à la gestion des objets  
	 */
	
}
