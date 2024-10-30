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
		parler("Je t'ai trouve vermine, tu vas payer pour ce que tu as fais à ce pauvre marchand !");
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa !");
			int argentGagner = adversaire.perdre();
			gagnerArgent(argentGagner);
			this.honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			this.honneur--;
			adversaire.gagner(this.getArgent());
			this.setArgent(0);
		}
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = (int) (this.getArgent()*0.1);
		this.setArgent(this.getArgent()-argentDonner); 
		parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
	}
}
