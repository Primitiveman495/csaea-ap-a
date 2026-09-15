package CrashCourse;

public class Fella {

    String characterName;
    int health;
    int hunger = 0;
    int thirst = 0;
    int age = 0;
    String[] clothes = new String[4];
    String hairColor;
    String job;
    String emotion;

    public Fella(String characterName,int health,String hairColor) {

        characterName = characterName
        health = health
        hairColor = hairColor

    }

    public void getEmployed() {

        // job = input

    }

    public void changeClothes() {

        // clothes = input

    }

    public void eat() {

        hunger -= 25;
        if(hunger < 0) {
            hunger = 0;
        }

    }

    public void drink() {

        thirst -= 25;
        if(thirst < 0) {
            thirst = 0;
        }

    }

    public void sleep() {

        // lullaby

    }

}
