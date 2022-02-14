public class Hobbit extends Razza{

    public Hobbit(int esperienzaDiCombattimento) {
        super(esperienzaDiCombattimento);
    }

    @Override
    public int calcolaForzadiCombattimento() {
        return 10 + (3 * esperienzaDiCombattimento);
    }
}
