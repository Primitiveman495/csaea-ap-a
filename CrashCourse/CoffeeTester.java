public class CoffeeTester {

    public static void main(String[] args){

        Coffee pikePlace = new Coffee(12, 0, "Pike Place", "Medium");
        Coffee verona = new Coffee(8, 0.5, "Cafe Verona", "Dark");

        pikePlace.drink();
        pikePlace.pourMilk();
        pikePlace.bio();
        verona.refillCoffee();
        verona.refillCoffee();
        verona.cool();
        verona.bio();


    }

}
