package Personaggio.Razza.Bene;

import Personaggio.Razza.Razza;

public class Elfo extends Razza {

    protected String fazione;

    public Elfo(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "bene";
    }

    @Override
    public int calcolaForzadiCombattimento() {
        if(esperienzaDiCombattimento < 5)
            return 20 + (3 * esperienzaDiCombattimento);
        else
            return 80 + (2 * esperienzaDiCombattimento);
    }

    public String getFazione(){
        return super.getFazione();
    }
}


