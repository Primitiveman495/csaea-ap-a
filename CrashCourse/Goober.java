package CrashCourse;

public class Goober{
    
    int slopAmassed = 0;
    double slimePercentage = 0;
    String blobName;
    boolean squelched = false;

    public Goober(int slop, double slime, String name){

        slopAmassed = slop;
        slimePercentage = slime;
        blobName = name;

    }

    public void accrueSlop(){

        if(!squelched){
            slopAmassed++;
        }

    }

    public void increaseSlime(){

        if(!squelched){
            if(slimePercentage <= 99.95){
                slimePercentage += 0.05;
            }
            else{
                System.out.println("My slime is already at " + slimePercentage + "%");
            }
        }

    }

    public void squelch(){

        squelched = true;

    }

    public void bio(){

        if(!squelched){
            System.out.println("Name: " + blobName + "\nAmassed Slop: " + slopAmassed + "\nSlime Percentage: " + slimePercentage);
        }
        else{
            System.out.println("Squelched.");
        }

    }

}
