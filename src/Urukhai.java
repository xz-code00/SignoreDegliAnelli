public class Urukhai extends Razza {

    protected String fazione;

    public Urukhai(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }


    @Override
    public int calcolaForzadiCombattimento() {
        return 50 + (5 * esperienzaDiCombattimento);
    }
}