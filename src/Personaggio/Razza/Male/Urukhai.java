package Personaggio.Razza.Male;

import Personaggio.Razza.Razza;

public class Urukhai extends Razza {

    protected String fazione;

    public Urukhai(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "male";
    }



    @Override
    public int calcolaForzadiCombattimento() {
        return 50 + (5 * esperienzaDiCombattimento);
    }

    public String getFazione(){
        return fazione;
    }

    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}
