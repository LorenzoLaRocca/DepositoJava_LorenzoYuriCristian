import java.util.ArrayList;

public class Utente{
    private String nome;
    private String idUtente;
    public ArrayList<Risorsa> risorseInPrestito = new ArrayList<>();

    public Utente(String nome, String idUtente){
        this.nome=nome;
        this.idUtente = idUtente;
    }

    //metodi get
    public String getNome() {
        return nome;
    }

    public String getIdUtente() {
        return idUtente;
    }
    //metodi set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdUtente(String idUtente){
        this.idUtente = idUtente;
    }

     public void prendiInPrestito(Risorsa risorsa) {
        if (risorsa != null) {
            risorseInPrestito.add(risorsa);
            System.out.println(nome + " ha preso in prestito: " + risorsa.getTitolo());
            
        }
     
    }

    public void restituisciRisorsa(Risorsa risorsa) {
        if (risorsa != null) {
            risorseInPrestito.remove(risorsa);
            System.out.println(nome + " ha restituito: " + risorsa.getTitolo());
            
        }else{
            System.out.println(" non aveva in prestito il libro");
        }
        
       
    }


    public void visualizzaRisorsePrestate() {
        System.out.println("Risorse Prestate :" + nome + " ID: " + idUtente);
        if (risorseInPrestito.isEmpty()) {
            System.out.println("Nessuna risorsa in prestito.");
            
        }
        for (Risorsa r : risorseInPrestito) {
            r.visualizzaDettagli();
        }
    }
}