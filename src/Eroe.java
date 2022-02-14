public class Eroe {
    protected String nome;
    protected int livelloDiEnergiaVitale;
    protected int esperienzaDiCombattimento;
    protected int forzaDiCombattimento;
    protected String fazione;

    public Eroe(String nome, int livelloDiEnergiaVitale, int esperienzaDiCombattimento, String fazione){
        this.nome = nome;
        this.livelloDiEnergiaVitale = livelloDiEnergiaVitale;
        this.esperienzaDiCombattimento = esperienzaDiCombattimento;
        forzaDiCombattimento = (50 * livelloDiEnergiaVitale) + (50 * esperienzaDiCombattimento);
        this.fazione = fazione;
    }
}
