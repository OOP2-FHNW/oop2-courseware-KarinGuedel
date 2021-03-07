package oop2.module03.trashcan;

/**
 * @author Dieter Holz
 */
public class TrashCan {

    private Object[] allTheWaste;  //Array mit dem Datentyp Object wird erzeugt

    public void trash(Object object){   //Methode, welche ein Object in den Trash wirft; Methode nicht umgesetzt
    }

    public Object getLast(){
        return null;
    }  // Methode, welche das letzte Object im Array ausgibt

    public Object[] purge(){
        return null;
    }

    public static void main(String[] args) { //main Methode, welche einen Trashcan erstellt und eine Banane dem Trashcan hinzufügt
        TrashCan trashCan = new TrashCan();

        Banana banana = new Banana();

        trashCan.trash(banana);

        Object o = trashCan.getLast();  //wenn das letzte Element im Trashcan eine Banane ist
        if(o instanceof Banana){        //muss die Banane in ein Object getypecastet werden
            banana = (Banana) o;
        }

    }

    static class Banana {

    }
}
