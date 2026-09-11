package CrashCourse;

public class EvilHenchman {
    
    // 1. Data / attributes
    int henchmanID;
    String[] tools = new String[0];
    boolean hasChutzpah;
    int whackingProfenciency;
    double weight;
    String[] clothes = new String[0];
    double salary = 15.1;

    // 2. Constructor 
    // Special method, only runs when we CREATE an henchman object.
    public EvilHenchman(int whacking, int id, double weight, boolean hasChutzpah) {

        // variables dont nessecarily have to match but its standard
        whackingProfenciency = whacking;
        henchmanID = id;
        weight = weight;
        hasChutzpah = hasChutzpah;

    }

    // 3. Behaviors

    public void inflate() {

        weight++;
        whackingProfenciency--;

    }

    public void whackSomeone() {

        salary += 0.2;
        whackingProfenciency++;

    }

    public void tooMuchScreenTime() {

        System.gc();

    }

}
