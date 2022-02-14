package Personaggio.Razza.Bene;

import Personaggio.Razza.Razza;


public class Uomo extends Razza {


    public Uomo(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "bene";
    }

    public int calcolaForzadiCombattimento(){
        return 30 + 6*(esperienzaDiCombattimento);
    }

    public String getFazione(){
        return super.getFazione();
    }

    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}
