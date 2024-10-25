package personnages;

public class Commercant extends Humain {	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		int argentPerdu = this.getArgent();
		this.perdreArgent(argentPerdu);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie genereux donateur!");
	}
}
