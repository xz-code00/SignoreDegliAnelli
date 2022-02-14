public class Hobbit extends Razza{

    protected String fazione;

    public Hobbit(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 10 + (3 * esperienzaDiCombattimento);
    }
}
