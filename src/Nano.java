public class Nano extends Razza {

    public Nano(int esperienzaDiCombattimento) {
        super(esperienzaDiCombattimento);
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 20 + (4 * esperienzaDiCombattimento);
    }
}