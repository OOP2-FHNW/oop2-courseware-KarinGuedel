package oop2.module03.trashcan;

/**
 * @author Dieter Holz
 */
public class RecyclingBin<T> {
    private T[] allTheWaste;  //es wird ein Array vom genereischen Datentyp T erstellt

    public void trash(T object){   //eine Methode, welche ein Objekt vom Datentyp T wegschmeisst
    }

    public T getLast(){
        return null;
    }  //eine Methdoe, welche das letzte Objekt im Array vom Datentyp T zurückgibt

    public T[] purge(){
        return null;
    }

    public static void main(String[] args) {  //main Methode
        RecyclingBin<Banana> recyclingBin = new RecyclingBin<>();  //ein neuer Abfalleimer vom Typ Banana wird erstellt

        Banana banana = new Banana();  //eine neue Banane wird generiert

        recyclingBin.trash(banana);  //die Banane wird in den Abfallseimer geschmissen

        banana = recyclingBin.getLast();  // das letzte Element des Abfalleimers ???

    }

    static class Banana {

    }
}
