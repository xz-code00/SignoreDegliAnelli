public class Orco extends Razza {

    protected String fazione;

    public Orco(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }

    @Override
    public int calcolaForzadiCombattimento() {
        if(esperienzaDiCombattimento < 5)
            return 30 + (2 * esperienzaDiCombattimento);
        else
            return 70 + (3 * esperienzaDiCombattimento);
    }


}

