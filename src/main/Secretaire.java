package main;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Secretaire extends Employe{
    ArrayList<Manager> managerTravail;


    public Secretaire(String leNom, String lePrenom, LocalDate laDate, Adresse lAdresse) throws Exception {
        super(leNom, lePrenom, laDate, lAdresse);
    }


    @Override
    public void augmenterLeSalaire(double pourcentage) {
        super.augmenterLeSalaire(pourcentage+(0.1*managerTravail.size()));
    }

    public void ajouterManager(Manager manager) {
        managerTravail.add(manager);
    }
}
