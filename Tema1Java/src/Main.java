public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10, "Biblioteca Centrala", "Str. Bibliotecii nr. 1");

        Carte carte1 = new Carte("Mandrie si prejudecata", "Jane Austen", 1813);
        Carte carte2 = new Carte("Harry Potter si Piatra Filozofala", "J.K. Rowling", 1997);
        Carte carte3 = new Carte("Toate pânzele sus!", "Radu Tudoran", 1953);

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);

        // Afisare biblioteca
        System.out.println(biblioteca);

        // Cautare dupa titlu
        String titluCautat = "Toate pânzele sus!";
        Carte[] cartiGasite = biblioteca.cautaDupaTitlu(titluCautat);
        System.out.println("Cărți găsite cu titlul \"" + titluCautat + "\":");
        for (Carte carte : cartiGasite) {
            System.out.println(carte);
        }
    }
}
