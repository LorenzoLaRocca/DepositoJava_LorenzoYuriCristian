public class Libro extends Risorsa {
    private String autore;

    public Libro(String titolo, int annoPubblicazione, String codice) {
        super(titolo, annoPubblicazione, codice);
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println(autore);
    }
}