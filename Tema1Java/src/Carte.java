public class Carte {
   final public String titlu;
   final public String autor;
   final public int anul_publicarii;

    public Carte(String titlu, String autor, int anul_publicarii) {
        this.titlu = titlu;
        this.autor = autor;
        this.anul_publicarii = anul_publicarii;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnul_publicarii() {
        return anul_publicarii;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", anul_publicarii=" + anul_publicarii +
                '}';
    }
}
