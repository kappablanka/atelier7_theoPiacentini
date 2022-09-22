package main;

import java.time.LocalDate;
import java.lang.Exception;


public class Employe extends Personne{
    public Employe(String leNom, String lePrenom, LocalDate laDate, Adresse lAdresse) throws Exception {
        super(leNom, lePrenom, lAdresse);
        if (laDate.isAfter(LocalDate.now().minusYears(16))){
            throw new Exception("age trop bas");
        }
        else if (laDate.isBefore(LocalDate.now().minusYears(65))){
            throw new Exception("age trop haut");
        }
        else {
            dateNaissance = laDate;
        }



    }
}
