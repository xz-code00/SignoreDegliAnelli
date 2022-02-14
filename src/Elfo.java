public class Elfo extends Razza {

    protected String fazione;

    public Elfo(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }

    @Override
    public int calcolaForzadiCombattimento() {
        if(esperienzaDiCombattimento < 5)
            return 20 + (3 * esperienzaDiCombattimento);
        else
            return 80 + (2 * esperienzaDiCombattimento);
    }


}

