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
// variable priv� qui comptent les instances 
	private static int nbreInstancesBis =0;
	
	//constructeur par d�faut
	public Ville(){
		// on incr�mente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		System.out.println("Cr�ation d'une ville !");
		nomVille = "inconnue";
		nomPays = "inconnue";
		
	}
	// constructeur avec param�tres ( 3 param�tre de meme type que dans la d�claration)
	public Ville(String pNom , String pPays, int pNbre){
		
		nomVille = pNom; 
		nomPays = pPays;
		setNbreHabitants(pNbre);
		// on incr�mente nos variables � chaque appel aux constructeurs 
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
	 
	// accesseur pour r�cuperer le nombre d'instance en mode private
	
	public static int getNombreInstancesBis(){
		return nbreInstancesBis;
	}
	
	/*
	 * les constructeurs : m�thodes servent � cr�er des objets
	 * les accesseurs : m�thodes servent � acc�der aux donn�es des dobjets 
	 * les m�thodes d'instance : m�thodes servent � la gestion des objets  
	 */
	
}
