package CrashCourse;

public class EvilHenchman {
    
    // 1. Data / attributes
    int henchmanID = 0;
    String[] tools = new String[3];
    boolean hasChutzpah;
    int whackingProfenciency;
    double weight;
    String[] clothes = new String[4];
    double salary = 15.1;

    // 2. Constructor 
    // Special method, only runs when we CREATE an henchman object.
    public EvilHenchman(int whacking, double weight, boolean hasChutzpah) {

        // variables dont nessecarily have to match but its standard
        whackingProfenciency = whacking;
        weight = weight;
        hasChutzpah = hasChutzpah;

        henchmanID += 1;

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

    public void disrespectTheBoss() {

        System.gc();

    }

    public void loiter() {

        System.out.print("gaabagul");

    }
}
