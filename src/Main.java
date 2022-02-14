import Personaggio.Eroe;
import Personaggio.Razza.Bene.Elfo;
import Personaggio.Razza.Male.Orco;
import Schieramenti.SchieramentoDelBene;
import Schieramenti.SchieramentoDelMale;

public class Main {

    public static void main (String[] args){

        Eroe reBarbaro = new Eroe("Re Barbaro", 5, 7, "bene");
        Eroe reArciere = new Eroe("Re Arciere", 5, 9, "male");

        Elfo elfo1 = new Elfo(4);
        Orco orco1 = new Orco(3);

        SchieramentoDelBene bene = new SchieramentoDelBene();
        SchieramentoDelMale male = new SchieramentoDelMale();

        bene.aggiungiInTesta(reBarbaro);
        bene.aggiungiInTesta(elfo1);
        bene.aggiungiInTesta(orco1);

        male.aggiungiInTesta(reArciere);
        male.aggiungiInTesta(orco1);

        System.out.println(determinaVincitore(bene, male));


    }

    public static String determinaVincitore(SchieramentoDelBene bene, SchieramentoDelMale male){
        if (bene.calcolaForzaTot() < male.calcolaForzaTot())
            return "Il vincitore è il male";
        else
            if (bene.calcolaForzaTot() > male.calcolaForzaTot())
                return "Il vincitore è il bene";
        else
            return "Pareggio";
    }
}
