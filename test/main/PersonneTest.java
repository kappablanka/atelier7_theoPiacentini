package main;



import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    static ArrayList<Personne> jdt_1 = new ArrayList<>();
    static ArrayList<Personne> jdt_2 = new ArrayList<>();




    @BeforeAll
    static void initAll() {

        Personne per1 = new Personne("Piacentini", "Théo", 28, 1, 2002, 1, "aaa",
                "20200", "Bastia");
        Personne per2 = new Personne("Piacentini", "Léa", 8, 4
                , 1996, 1, "aaa",
                "20200", "Bastia");
        jdt_1.add(per1);
        jdt_2.add(per1);
        jdt_2.add(per2);
    }

    @Test
    void lambdaExpressions() {
        int[] numbers = {0, 1, 2, 3, 4};
        for (int i = 0; i < 5; i++) {
            assertEquals(numbers[i], i);
        }

    }

    @Test
    @DisplayName("test getNom")
    void getNom() {
        String[] expected = {"PIACENTINI"};
        assertAll("Strings",
                () -> assertEquals(expected[0], jdt_1.get(0).getNom())
        );
    }

    @Test
    @DisplayName("test GetPrenom")
    void getPrenom() {
        String[] expected = {"Théo"};
        assertAll("Strings",
                () -> assertEquals(expected[0], jdt_1.get(0).getPrenom())
        );
    }

    @Test
    void getDateNaissance() {
        LocalDate expectedDate1 = LocalDate.of(2002, 1, 28);
        LocalDate expectedDate2 = LocalDate.of(1996, 4, 8);
        LocalDate[] expected = {expectedDate1, expectedDate2};
        assertAll("Strings",
                () -> assertEquals(expected[0], jdt_1.get(0).getDateNaissance()),
                () -> assertEquals(expected[1], jdt_2.get(1).getDateNaissance())
        );
    }

    @Test
    void getAdresse() {
        Adresse adrComp = new Adresse(1, "aaa", "20200", "Bastia");
        Adresse[] expected = {adrComp};
        assertAll("numbers",
                () -> assertTrue(expected[0].equals(jdt_1.get(0).getAdresse()))
        );
    }


    @Test
    void getNb_personne() {
        int[] expected = {2};
        assertAll("LocalDate",
                () -> assertEquals(expected[0], jdt_1.get(0).getNb_personne())
        );
    }


    @Test
    void plusAgeeQue() {
        boolean[] expected = {true, false};
        assertAll("LocalDate",
                () -> assertEquals(expected[0], jdt_2.get(1).plusAgeeQue(jdt_2.get(0))),
                () -> assertEquals(expected[1], jdt_2.get(0).plusAgeeQue(jdt_2.get(1)))
        );
    }

    @Test
    void plusAgee() {
    }

    @Test
    void testEquals() {
    }

}