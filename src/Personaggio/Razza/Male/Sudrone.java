package Personaggio.Razza.Male;

import Personaggio.Razza.Razza;

public class Sudrone extends Razza {


    public Sudrone(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "male";
    }



    @Override
    public int calcolaForzadiCombattimento() {
        return 40 + (5 * esperienzaDiCombattimento);
    }

   /* public String getFazione(){
        return fazione;
    }

    */


    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}
