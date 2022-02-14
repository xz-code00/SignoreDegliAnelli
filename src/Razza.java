abstract public class Razza {
    protected int esperienzaDiCombattimento;
    protected int forzaDiCombattimento;

    public Razza(int esperienzaDiCombattimento){
        this.esperienzaDiCombattimento = esperienzaDiCombattimento;
        forzaDiCombattimento = 0;
    }

    abstract public void calcolaForzadiCombattimento();
}
