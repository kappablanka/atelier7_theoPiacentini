package main;

import java.time.LocalDate;
import java.util.*;



public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    protected LocalDate dateNaissance = LocalDate.of(1800, 1, 1);
    private Adresse adresse=ADRESSE_INCONNUE;
	private static int nb_personne=0;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, LocalDate laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		nb_personne += 1;
	}

	public Personne(String leNom, String lePrenom, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		adresse=lAdresse;
		nb_personne += 1;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'ann�e de naissance
	 * @param numero le n� de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
					String ville){

		this(leNom, lePrenom, LocalDate.of(a, m, j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le pr�nom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 *
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Personne{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", dateNaissance=" + dateNaissance +
				", adresse=" + adresse +
				", nb_personne=" + nb_personne +
				'}';
	}

	/**
	 * getter de nb_personne
	 * @return Le nombre de personnes enregistré
	 */
	public int getNb_personne() {
		return nb_personne;
	}




	/**
	 * Compare l'age de deux personnes
	 * @param autrePersonne autre objet Personne
	 * @return 1 si plus age 0 sinon
	 */
	public boolean plusAgeeQue(Personne autrePersonne){
		boolean resultat = false;
		if (dateNaissance.compareTo(autrePersonne.getDateNaissance()) < 0) {
			resultat = true;
		}
		return resultat;
	}

	public boolean plusAgee(Personne personne1, Personne personne2){
		boolean resultat = false;
		if (personne1.getDateNaissance().compareTo(personne2.getDateNaissance()) > 0) {
			resultat = true;
		}
		return resultat;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Personne personne = (Personne) o;
		return nb_personne == personne.nb_personne && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(dateNaissance, personne.dateNaissance);
	}

	@Override
	public int hashCode() {
		return 0;
	}
}

    
   
   