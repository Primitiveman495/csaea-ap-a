public class Coffee {

    private int flOz = 0;
    private double milkPercentage = 0;
    private String coffeeBlend;
    private String coffeeRoast;
    private boolean isHot = true;

    public Coffee(int oz, double milk, String blend, String roast){

        flOz = oz;
        milkPercentage = milk;
        coffeeBlend = blend;
        coffeeRoast = roast;

    }

    public void drink(){

        if(flOz < 0){
            flOz--;
        }
        else{
            System.out.println("Theres no more coffee left!");
        }

    }

    public void pourMilk(){

        if(flOz <= 19){
            milkPercentage = (1 + (flOz * milkPercentage)) / flOz;
            flOz++;
        }
        else{
            System.out.println("Your cup is full!");
        }

    }

    public void refillCoffee(){

        if(flOz <= 19){
            flOz++;
        }
        else{
            System.out.println("Your cup is full!");
        }

    }

    public void cool(){

        if(isHot){
            isHot = !isHot;
        }
        else{
            System.out.println("Your coffee is already cold...");
        }

    }

    public void bio(){

        System.out.println("Your coffee is a " + coffeeRoast + " roast named " + coffeeBlend + ".");
        System.out.println("You have " + flOz + "fl oz left.");
        if(milkPercentage == 0){
            System.out.println("Your coffee is black.");
        }
        else if(milkPercentage > 0 && milkPercentage < 0.6){
            System.out.println("Your coffee is a cortado");
        }
        else if(milkPercentage >= 0.6 && milkPercentage < 1){
            System.out.println("Your coffee is a latte");
        }
        else{
            System.out.println("You have a glass of milk");
        }
        if(isHot){
            System.out.println("Your coffee is hot");
        }
        else{
            System.out.println("Your coffee is cold");
        }

    }

}
