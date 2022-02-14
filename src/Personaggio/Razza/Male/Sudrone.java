package Personaggio.Razza.Male;

import Personaggio.Razza.Razza;

public class Sudrone extends Razza {

    protected String fazione;

    public Sudrone(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "male";
    }



    @Override
    public int calcolaForzadiCombattimento() {
        return 40 + (5 * esperienzaDiCombattimento);
    }

    public String getFazione(){
        return super.getFazione();
    }

    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}
