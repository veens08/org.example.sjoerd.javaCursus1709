package org.example.sjoerd.javaCursus1709;

public class Persoon {
    private int id;
    private String naam;
    private int leeftijd;
    private Persoon fiscaalPartner;

    // Dr consructor die geen parameters heeft wordt ook wel de default comstructor genoemd
    Persoon() {
        setId (0);
        setNaam (null);
        setLeeftijd (18);
    }

    // Dit wordt ook wel constructor genoemd
    Persoon(int newId, String newNaam, int newLeeftijd) {
        //Eerst controles, als OK dan state aanpassen
        setId(newId);
        setNaam(newNaam);
        setLeeftijd(newLeeftijd);
    }

    int getId () {
        return id;
    }

    String getNaam() {
        return naam;
    }

    int getLeeftijd() {
        return leeftijd;
    }

    void setId (int newId) {
        //Eerst controles, als OK dat state aanpassen
        id = newId;
    }

    void setNaam (String newNaam) {
        //Eerst controles, als OK dat state aanpassen
        naam = newNaam;
    }

    void setLeeftijd (int newLeeftijd) {
        //Eerst controles, als OK dat state aanpassen
        leeftijd = newLeeftijd;
    }

    void setFiscaalPartner (Persoon newPersoon) {
        //Eerst controles, als OK dat state aanpassen
        fiscaalPartner = newPersoon;
    }

    String toSringRepresentation() {
        return "Persoon  [id = " + id + " Naam = " + naam + " leeftijd = " + leeftijd + "]";
    }
}
