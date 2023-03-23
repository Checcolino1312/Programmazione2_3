package Lab;

import java.util.HashMap;

import java.util.Iterator;


class Libro {
private String id;
private String titolo;
private String autore;

public Libro(String id, String titolo, String autore) {
    this.id = id;
    this.titolo = titolo;
    this.autore = autore;
}
public String getId() {
    return id;
}

public String getTitolo() {
    return titolo;
}

public String getAutore() {
    return autore;
}

@Override
public String toString() {
    return "\nID: " + id + ", \nTitolo: " + titolo + ", \nAutore: " + autore;
}

}

public class Main {
public static void main(String[] args) {
HashMap<String, Libro> libri = new HashMap<>();

Libro libro1 = new Libro("1", "Il Signore degli Anelli", "J.R.R. Tolkien");
libri.put(libro1.getId(), libro1);
Libro libro2 = new Libro("2", "Lo Hobbit", "J.R.R. Tolkien");
libri.put(libro2.getId(), libro2);
Libro libro3 = new Libro("3", "Dragonball", "Akyra Toriyama");
libri.put(libro3.getId(), libro3);
    
    System.out.println("Libri presenti nella HashMap:");

    Iterator<Libro> iterator = libri.values().iterator();
    while(iterator.hasNext()) {
        System.out.println(iterator.next());
}


}
}

//una classe libro, inserirla in un hashmap, 
//fare il controllo che l'id è univoco e iterare la stampa