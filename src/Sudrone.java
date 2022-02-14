public class Sudrone extends Razza {

    protected String fazione;

    public Sudrone(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }


    @Override
    public int calcolaForzadiCombattimento() {
        return 40 + (5 * esperienzaDiCombattimento);
    }
}