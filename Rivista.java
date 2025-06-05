public class Rivista extends Risorsa {
    private int numeroRivista;

    public Rivista(String titolo, int annoPubblicazione, String codice) {
        super(titolo, annoPubblicazione, codice);
        // TODO Auto-generated constructor stub
    }

    public int getNumeroRivista() {
        return numeroRivista;
    }

    public void setNumeroRivista(int numeroRivista) {
        this.numeroRivista = numeroRivista;
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println(numeroRivista);
    }
}
