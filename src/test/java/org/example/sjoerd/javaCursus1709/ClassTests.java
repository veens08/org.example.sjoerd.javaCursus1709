package org.example.sjoerd.javaCursus1709;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ClassTests {

    // Een voorbeeld van overloading (zelfde naam van een methode, maar verschillende parameters)
    @Test
    void name() {

    }

    @Test
    void name(int aantal) {

    }
    @Test
    void hoeKunnenWeObjectemMaken() {
         Persoon persoon = new Persoon();

         System.out.println (persoon.getId ());
         System.out.println (persoon.getLeeftijd ());
         System.out.println (persoon.getNaam ());
         assertThat(persoon).isNotNull ();
    }

    @Test
    void KunnenWeObjectemMaken() {
        Persoon persoon = new Persoon();

        persoon.setId (1);
        persoon.setNaam ("Sjoerd");
        persoon.setLeeftijd (58);

        System.out.println (persoon.getId ());
        System.out.println (persoon.getLeeftijd ());
        System.out.println (persoon.getNaam ());
        assertThat(persoon).isNotNull ();
    }

    @Test
    void kanHetSneller () {
        Persoon persoon = new Persoon (1, "Sjoerd", 58);
        System.out.println (persoon.getId ());
        System.out.println (persoon.getLeeftijd ());
        System.out.println (persoon.getNaam ());
        assertThat(persoon).isNotNull ();
    }

    @Test
    void kanHetSnellerDefault () {
        Persoon persoon = new Persoon ();
        //Persoon persoon = new Persoon (1, "Sjoerd");
        System.out.println (persoon.getId ());
        System.out.println (persoon.getLeeftijd ());
        System.out.println (persoon.getNaam ());
        assertThat(persoon).isNotNull ();
    }

    @Test
    void kanHetSnellerString () {
        Persoon persoon = new Persoon (1, "Sjoerd", 58);
        System.out.println (persoon.toSringRepresentation ());
    }

    @Test
    void maakOverzichtVanPersonenEnHunEventueleFiscalePartner() {
        // id naam persoom heeft wel/geen fiscale partner id fiscale partner naam fiscale partner
    }
}
