package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public int getHonneur() {
		return honneur;
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur*2;
		if (force>=adversaire.getReputation()) {
			int argentGagner = adversaire.perdre();
			gagnerArgent(argentGagner);
			this.honneur++;
			parler(getNom() + " a gagne le duel contre " + adversaire.getNom());
		} else {
			this.honneur--;
			adversaire.gagner(this.getArgent());
			this.setArgent(0);
			parler(getNom() + " a perdu le duel contre " + adversaire.getNom());
		}
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (this.getArgent()*0.1);
		this.setArgent(this.getArgent()-argentDonner); 
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
	}
}
