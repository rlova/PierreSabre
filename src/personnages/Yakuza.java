package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		this.setArgent(0);
		this.reputation--;
		parler("J'ai perdu mon duel et mes " + argentPerdu + " sous snif... J'ai deshonorer le clan de " + getClan());
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		this.setArgent(getArgent()+gain);
		parler("Je t'ai eu petit ");
 }
	
	public void extorquer(Commercant victime) {
		parler("Tiens,Tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + ", si tu tiens à ta vie donne moi ta bourse !");
		int argentExtorque = victime.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		parler("J’ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
