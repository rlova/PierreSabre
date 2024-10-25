package personnages;

import java.lang.reflect.Method;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boissonFavorite = boisson;
		this.argent = argent;
		
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (getArgent()>=prix) {
			parler("J'ai "+ getArgent() + " sous en proche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous" );
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+ getArgent() + " sous en proche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous" );
		}
	}
	
	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int perte) {
		argent -= perte;
	} 
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}
	
	public String prendreParole() {
		return "("+ nom + ") - ";
	}
}














// public class Commercant extends Humain {
//	public Commercant(String nom, int qteArgent) {
//super(nom,q)
