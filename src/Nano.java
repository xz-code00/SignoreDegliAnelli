public class Nano extends Razza {

    protected String fazione;

    public Nano(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }
    @Override
    public int calcolaForzadiCombattimento() {
        return 20 + (4 * esperienzaDiCombattimento);
    }
}