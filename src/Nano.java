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
}