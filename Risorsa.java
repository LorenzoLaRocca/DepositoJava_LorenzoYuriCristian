public class Risorsa{
    private String titolo;      // attributi private della superclasse
    private int annoPubblicazione;
    private String codice;

    public Risorsa(String titolo, int annoPubblicazione, String codice) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.codice = codice;
    }
    // metodi setters e getters

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String newTitolo) {
        this.titolo = newTitolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int newAnnoPubblicazione) {
        this.annoPubblicazione = newAnnoPubblicazione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String newCodice) {
        this.codice = newCodice;
    }
    // metodo per visualizzare le informazioni della risorsa
    public void visualizzaDettagli() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Anno di pubblicazione: " + annoPubblicazione);
        System.out.println("Codice: " + codice);
    }
}