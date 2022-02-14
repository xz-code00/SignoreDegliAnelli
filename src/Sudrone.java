public class Sudrone extends Razza {

    public Sudrone(int esperienzaDiCombattimento) {
        super(esperienzaDiCombattimento);
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 40 + (5 * esperienzaDiCombattimento);
    }
}