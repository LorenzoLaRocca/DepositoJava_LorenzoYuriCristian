import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Biblioteca biblioteca = new Biblioteca();
         * 
         * Libro libro = new Libro("Il Signore degli Anelli", 1937, "001");
         * Ebook ebook = new Ebook("1984", 1949, "002");
         * Rivista rivista = new Rivista("National Geographic", 2025, "003");
         * 
         * biblioteca.aggiungiRisorsa(libro);
         * biblioteca.aggiungiRisorsa(ebook);
         * biblioteca.aggiungiRisorsa(rivista);
         * 
         * Utente utente1 = new Utente("Mario", "U001");
         * Utente utente2 = new Utente("Luigi", "U002");
         */

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Risorsa risorsa=new Risorsa(null, 0, null);
        while (true) {
            System.out.println(
                    "1 per inserire una risorsa \n2 per inserire un utente \n3 stampare inventario biblioteca \n4 cercare per titolo \n5 per uscire ");
            int scelta = Integer.parseInt(sc.nextLine());
            switch (scelta) {
                case 1:
                    System.out
                            .println("Che tipo di risorsa vuoi inserire? \n1 per Libro \n2 per Ebook \n3 per Rivista");
                    int risorsa = Integer.parseInt(sc.nextLine());
                    if (risorsa ==1) {
                        String titolo = sc.nextLine();
                        int anno = Integer.parseInt(sc.nextLine());
                        String codice = sc.nextLine();
                        biblioteca.aggiungiRisorsa(Risorsa libro=new Libro(titolo,anno,codice));
                    }
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        }
    }
}
