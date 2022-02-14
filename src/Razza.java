abstract public class Razza {
    protected int esperienzaDiCombattimento;
    protected int forzaDiCombattimento;

    public Razza(int esperienzaDiCombattimento){
        this.esperienzaDiCombattimento = esperienzaDiCombattimento;
        forzaDiCombattimento = calcolaForzadiCombattimento();
    }

    abstract public int calcolaForzadiCombattimento();
}
