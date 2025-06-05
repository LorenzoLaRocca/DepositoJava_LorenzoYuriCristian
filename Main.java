import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Musei Vaticani");

        while (true) {
            System.out.println(
                    "1 per inserire una risorsa \n2 per inserire un utente \n3 stampare inventario biblioteca \n4 cercare per titolo \n5 per uscire ");
            int scelta = Integer.parseInt(sc.nextLine());
            switch (scelta) {
                case 1:
                    System.out.println("Che tipo di risorsa vuoi inserire? \n1 per Libro \n2 per Ebook \n3 per Rivista");
                    int risorsa = Integer.parseInt(sc.nextLine());
                    if (risorsa == 1) {
                        String titolo = sc.nextLine();
                        int anno = Integer.parseInt(sc.nextLine());
                        String codice = sc.nextLine();
                        biblioteca.aggiungiRisorsa(new Libro(titolo, anno, codice));
                    } else if (risorsa == 2){
                        String titolo = sc.nextLine();
                        int anno = Integer.parseInt(sc.nextLine());
                        String codice = sc.nextLine();
                        biblioteca.aggiungiRisorsa(new Ebook(titolo, anno, codice));
                    } else if (risorsa == 3) {
                        String titolo = sc.nextLine();
                        int anno = Integer.parseInt(sc.nextLine());
                        String codice = sc.nextLine();
                        biblioteca.aggiungiRisorsa(new Rivista(titolo, anno, codice));                          
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il nome: ");
                    String utente = sc.nextLine();
                    System.out.println("Inserisci l'id: ");
                    String id = sc.nextLine();
                    biblioteca.aggiungiUtente(new Utente(utente, id));
                    break;
                case 3:
                    biblioteca.visualizzaDettagli();
                    break;
                case 4:
                    System.out.println("Inserisci Titolo: ");
                    String titoloLibro = sc.nextLine();
                    biblioteca.cercaRisorsaPerTitolo(titoloLibro);
                    break;
                case 5:
                    System.out.println("Arrivederci");
                    sc.close();
                    return;
            }

        }
    }
}
