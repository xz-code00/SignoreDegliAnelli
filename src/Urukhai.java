public class Urukhai extends Razza {

    public Urukhai(int esperienzaDiCombattimento) {
        super(esperienzaDiCombattimento);
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 50 + (5 * esperienzaDiCombattimento);
    }
}