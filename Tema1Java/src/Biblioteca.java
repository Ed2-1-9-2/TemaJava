import java.util.Arrays;
public class Biblioteca {
private final Carte[] carti;
private final String denumire;
private final String adresa;
private int index;

    public Biblioteca(int dimensiune , String denumire, String adresa) {
        this.carti = new Carte[dimensiune];
        this.denumire = denumire;
        this.adresa = adresa;
        this.index = 0;
    }
    public void adaugaCarte(Carte carte){
        if(index < carti.length){
            carti[index]=carte;
            index++;
        }else {
            System.out.println("Nu ar exista spatiu disponibil pentru a adauga o carte in biblioteca");
        }
    }
    public Carte[] cautaDupaTitlu(String titlu){
        Carte[] rezultat = new Carte [carti.length];
        int count = 0;
        for (Carte carte : carti){
            if(carte!=null && carte.getTitlu().equalsIgnoreCase(titlu)){
                rezultat[count]=carte;
                count++;
            }
        }
        return Arrays.copyOfRange(rezultat,0,count);
    }
    // Am folosit append pentru a scurta parcurgerea stringului
    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("Biblioteca ").append(denumire).append(",localizata la adresa").append(adresa).append("\n");
    sb.append("Cartile din biblioteca:\n");
    for (Carte carte : carti) {
    if(carte!=null){
        sb.append(carte).append("\n");
    }
    }
    return sb.toString();
    }
}

