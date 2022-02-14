package Personaggio.Razza.Bene;

import Personaggio.Razza.Razza;

public class Nano extends Razza {

    protected String fazione;

    public Nano(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "bene";
    }


    @Override
    public int calcolaForzadiCombattimento() {
        return 20 + (4 * esperienzaDiCombattimento);
    }

    public String getFazione(){
        return super.getFazione();
    }

    public int getForzaDiCombattimento(){
        return forzaDiCombattimento;
    }
}
