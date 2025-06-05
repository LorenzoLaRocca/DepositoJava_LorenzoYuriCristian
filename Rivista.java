public class Rivista extends Risorsa {
    private int numeroRivista;

    public Rivista(String titolo, int annoPubblicazione, String codice,int numeroRivista) {
        super(titolo, annoPubblicazione, codice);
        this.numeroRivista = numeroRivista;
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
