package Personaggio.Razza.Bene;

import Personaggio.Razza.Razza;

public class Hobbit extends Razza {

    public Hobbit(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "bene";
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 10 + (3 * esperienzaDiCombattimento);
    }

   /* public String getFazione(){
        return fazione;
    }

    */


    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}

