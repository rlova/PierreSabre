package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco","the",15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, null);
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yaku);
	}

	Tester dans la classe HistoireTP4 pour obtenir le scénario ci-dessous.
	(Roro) - Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre
	marchand!
	(Roro) - Je t’ai eu petit yakusa!
	(Yaku Le Noir) - J’ai perdu mon duel et mes 45 sous, snif... J'ai déshonoré le clan de
	Warsong
}

