package voitures;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class Voiture {
	
	int matricule;
	int puissance;
	String couleur;
	
	public void roule() {
		System.out.println("la voiture " + matricule + " roule");
		
	}
	public Voiture() {
		matricule = 1;
	}
	public Voiture(int matricule){
    this.matricule = matricule;
	}
	}
	


