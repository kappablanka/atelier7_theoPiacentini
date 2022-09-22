package main;

import java.util.GregorianCalendar;

public class Employe extends Personne{
    public Employe(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse) {
        super(leNom, lePrenom, laDate, lAdresse);
    }
}
