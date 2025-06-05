import java.util.ArrayList;

public class Biblioteca {
    private String nome; // Nome della biblioteca

    private ArrayList<Risorsa> listaRisorseTotali = new ArrayList<>(); // Lista di risorse totali nella biblioteca
    private ArrayList<Utente> listaUtenti = new ArrayList<>();      // Lista di utenti registrati nella biblioteca  
    
    public Biblioteca(String nome) { // Costruttore della classe Biblioteca
        this.nome = nome;
    }
    public void aggiungiUtente(Utente utente) { // Metodo per aggiungere un utente alla biblioteca
        if (utente != null) {
            listaUtenti.add(utente);
            System.out.println("Utente " + utente.getNome() + " aggiunto alla biblioteca.");
        } else {
            System.out.println("Utente non valido.");
        }
    }

    public void aggiungiRisorsa(Risorsa risorsa){       // Metodo per aggiungere una risorsa alla biblioteca
        if (risorsa != null) {                          // Verifica se la risorsa non è nulla
            listaRisorseTotali.add(risorsa);
            System.out.println("Risorsa " + risorsa.getTitolo() + " aggiunta alla biblioteca.");
        } else {
            System.out.println("Risorsa non valida.");
        }
    }

    public void visualizzaDettagli() {                  // Metodo per visualizzare i dettagli della biblioteca
        System.out.println("Nome della biblioteca: " + nome);
        System.out.println("Utenti registrati:");
        if (listaRisorseTotali.isEmpty()) {
            System.out.println("Nessuna risorsa trovata.");
        } else {
            for (Risorsa listaR : listaRisorseTotali) {         // Itera attraverso la lista degli utenti e stampa i loro dettagli
                 listaR.visualizzaDettagli();   
            }
        }
    }
    public void cercaRisorsaPerTitolo(String titolo) {               // Metodo per cercare una risorsa per titolo
        boolean found = false;                                        // Variabile per verificare se la risorsa è stata trovata      
        for (Risorsa risorsa : listaRisorseTotali) {
            if (risorsa.getTitolo().equalsIgnoreCase(titolo)) {
                
                found = true;
                risorsa.visualizzaDettagli();
                break;
            }
        }
        if (!found) {   // Se la risorsa non è stata trovata, stampa un messaggio                                           
            System.out.println("Risorsa con titolo '" + titolo + "' non trovata.");
        }
    }
}

    
