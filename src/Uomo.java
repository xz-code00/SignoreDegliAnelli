public class Uomo extends Razza{

    protected String fazione;

    public Uomo(int esperienzaDiCombattimento){
        super(esperienzaDiCombattimento);
        this.fazione = "bene";
    }

    public int calcolaForzadiCombattimento(){
        return 30 + 6*(esperienzaDiCombattimento);
    }
}
