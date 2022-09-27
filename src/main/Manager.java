package main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employe{
    ArrayList<Secretaire> secretaireTravail;
    public Manager(String leNom, String lePrenom, LocalDate laDate, Adresse lAdresse) throws Exception {
        super(leNom, lePrenom, laDate, lAdresse);
    }

    @Override
    public void augmenterLeSalaire(double pourcentage) {
        super.augmenterLeSalaire(pourcentage+(0.5*calculAnnuite()));
    }

    public void ajouterSecretaire(Secretaire secretaire) {
        secretaireTravail.add(secretaire);
        secretaire.ajouterManager(this);
    }
}
