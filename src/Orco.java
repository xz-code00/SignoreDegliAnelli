public class Orco extends Razza {

    protected String fazione;

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


}

