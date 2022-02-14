public class Elfo extends Razza {

    public Elfo(int esperienzaDiCombattimento) {
        super(esperienzaDiCombattimento);
    }

    @Override
    public int calcolaForzadiCombattimento() {
        if(esperienzaDiCombattimento < 5)
            return 20 + (3 * esperienzaDiCombattimento);
        else
            return 80 + (2 * esperienzaDiCombattimento);
    }


}

