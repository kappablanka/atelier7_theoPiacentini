package main;

import java.time.LocalDate;
import java.lang.Exception;
import java.util.Objects;


public class Employe extends Personne{
    double salaire = 0;
    LocalDate dateEmbauche;
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


    public void augmenterLeSalaire(double pourcentage) {
        if (pourcentage > 0) {
            salaire *= 100;
        }
    }

    public int calculAnnuite() {
        int annuite = LocalDate.now().getYear() - dateEmbauche.getYear() - 1;
        if (LocalDate.now().getMonthValue() < dateEmbauche.getMonthValue()) {
            annuite += 1;
        }
        else if (LocalDate.now().getMonthValue() == dateEmbauche.getMonthValue()) {
            if (LocalDate.now().getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                annuite += 1;
            }
        }
        return annuite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employe employe = (Employe) o;
        return Double.compare(employe.salaire, salaire) == 0 && Objects.equals(dateEmbauche, employe.dateEmbauche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salaire, dateEmbauche);
    }
}


