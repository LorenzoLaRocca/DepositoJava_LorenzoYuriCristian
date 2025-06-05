public class Ebook extends Risorsa {
    private String formato; // Esempio (PDF, EPUB)

    public Ebook(String titolo, int annoPubblicazione, String codice) {
        super(titolo, annoPubblicazione, codice);
        // TODO Auto-generated constructor stub
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println(formato);
    }
}
