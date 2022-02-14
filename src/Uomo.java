public class Uomo extends Razza{

    protected String fazione;

    public Uomo(int esperienzaDiCombattimento, String fazione){
        super(esperienzaDiCombattimento);
        this.fazione = fazione;
    }

    public int calcolaForzadiCombattimento(){
        return 30 + 6*(esperienzaDiCombattimento);
    }
}
