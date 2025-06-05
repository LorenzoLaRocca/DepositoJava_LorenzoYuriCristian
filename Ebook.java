public class Ebook extends Risorsa {
    private String formato; // Esempio (PDF, EPUB)

    public Ebook(String titolo, int annoPubblicazione, String codice,String formato) {//metodo costruttore
        super(titolo, annoPubblicazione, codice);
        this.formato = formato;
    }
    //metodi get e set
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    //override metodo di stampa dalla superclasse Risorsa
    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println(formato);
    }
}
