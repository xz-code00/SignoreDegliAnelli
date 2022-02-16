package Personaggio.Razza;

abstract public class Razza {
    protected int esperienzaDiCombattimento;
    protected int forzaDiCombattimento;
    protected String fazione;

    public Razza(int esperienzaDiCombattimento){
        this.esperienzaDiCombattimento = esperienzaDiCombattimento;
        forzaDiCombattimento = calcolaForzadiCombattimento();
        fazione = "";
    }

    abstract public int calcolaForzadiCombattimento();

    public String getFazione() {
        return fazione;
     }

    abstract public int getForzaDiCombattimento();
}
