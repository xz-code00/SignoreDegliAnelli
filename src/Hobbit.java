public class Hobbit extends Razza{

    protected String fazione;

    public Hobbit(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "bene";
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 10 + (3 * esperienzaDiCombattimento);
    }
}
