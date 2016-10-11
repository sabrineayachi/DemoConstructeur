package voitures;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voiture v = new Voiture(3);
		v.roule();
		
		Voiture v1 = new Voiture();
		v1.matricule = 2;
		
		Voiture v2 = new Voiture();
		v2.matricule = 3;

		System.out.println(v1.matricule + " " + v2.matricule);
		

	}

}
