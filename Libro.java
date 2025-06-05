public class Libro extends Risorsa {
    private String autore;//dichiarazione attributi

    public Libro(String titolo, int annoPubblicazione, String codice) {//metodo costruttore
        super(titolo, annoPubblicazione, codice);
    }
    //metodi get e set
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
    //override metodo di stampa dalla superclasse Risorsa
    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println(autore);
    }
}