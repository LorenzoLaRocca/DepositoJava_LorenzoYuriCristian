import java.util.ArrayList;

public class Biblioteca {
    private String nome; // Nome della biblioteca

    private ArrayList<Risorsa> listaRisorseTotali = new ArrayList<>(); // Lista di risorse totali nella biblioteca
    private ArrayList<Utente> listaUtenti = new ArrayList<>(); 
    

    public void aggiungiUtente(Utente utente) {
        if (utente != null) {
            listaUtenti.add(utente);
            System.out.println("Utente " + utente.getNome() + " aggiunto alla biblioteca.");
        } else {
            System.out.println("Utente non valido.");
        }
    }

    public void aggiungiRisorsa(Risorsa risorsa){
        if (risorsa != null) {
            listaRisorseTotali.add(risorsa);
            System.out.println("Risorsa " + risorsa.getTitolo() + " aggiunta alla biblioteca.");
        } else {
            System.out.println("Risorsa non valida.");
        }
    }

    public void visualizzaDettagli() {
        System.out.println("Nome della biblioteca: " + nome);
        System.out.println("Utenti registrati:");
        if (listaUtenti.isEmpty()) {
            System.out.println("Nessun utente registrato.");
        } else {
            for (Utente utente : listaUtenti) {
                System.out.println("Nome: " + utente.getNome() + ", ID Utente: " + utente.getIdUtente());
            }
        }
    }
    public void cercaRisorsaPerTitolo(String titolo) {
        boolean found = false;
        for (Risorsa risorsa : listaRisorseTotali) {
            if (risorsa.getTitolo().equalsIgnoreCase(titolo)) {
                risorsa.visualizzaDettagli();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Risorsa con titolo '" + titolo + "' non trovata.");
        }
    }
}

    
