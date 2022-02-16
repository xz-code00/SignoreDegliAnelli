package Personaggio.Razza.Male;

import Personaggio.Razza.Razza;

public class Orco extends Razza {


    public Orco(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "male";
    }


    @Override
    public int calcolaForzadiCombattimento() {
        if(esperienzaDiCombattimento < 5)
            return 30 + (2 * esperienzaDiCombattimento);
        else
            return 70 + (3 * esperienzaDiCombattimento);
    }

   /* public String getFazione(){
        return fazione;
    }

    */


    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}


