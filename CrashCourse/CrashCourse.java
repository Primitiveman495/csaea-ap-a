package CrashCourse;

public class CrashCourse {
    
    public static void main(String[] args) {
        
        // Comment

        /*
        Multiline Comment
        */

        System.out.print("Heh heh Hello ");
        System.out.println("Heh heh heh heh Hello");

        // varialbe declarations:
         // PRIMITIVE VARIABLES
         int a; // integer
         double b; // decimal, or float
         boolean c; // true or false;

         a = 4;
         b = 5.5;
         c = false; // lowercase

         // Arithmetic Operators 
         // + - / *  %
         // += -= /=  %=
        int d = 3;
        d += 7;

        System.out.println("d is equal to " + d);

        // increment and decrement by one:
        // --  ++
        d--;
        d++;
        d++;
        System.out.println("d is NOW equal to " + d);

        //COMPARISONS (always returns true or false)
        //  <  >   <=   >=   ==   !=
        System.out.println(4 < 5);
        System.out.println(7 == 4);
        System.out.println(1 != 2);

        // LOGICAL OPERATORS 
        // In order of presedence: NOT:  !   AND: &&   OR: ||
        boolean e = false; boolean f = true;

        // predict output: true or false? 
        System.out.println(!e);  //true
        System.out.println(e && f);// false
        System.out.println(e || f); //true
        System.out.println(e || f && !e); // true

        System.out.println( e && f); // short circuits after checking e -- java does not need to check f.

        // Casting (converting variables)
        int g = (int)5.5;
        System.out.println("5.5 rounds to " + g);
        double h = (double)5/6;
        System.out.println(h);

        // STRINGS
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye.";
        String result = s1 + s2 + s3;
        result += "\nDo you like inflation?";
        System.out.println(result);

        // 1D ARRAYS
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("Remainder: " + arry1[0] % arry1[1]);

        int[] arry2 = {34, 52, 3, 64, 32};
        System.out.println("arry2: " + arry2);

        // 2D ARRAYS
        int[][] arryGrid1 = new int[4][3]; // First bracket is how many rows, second is how many columns
        /*
        {
        {0, 0, 0}
        {0, 0, 0}
        {0, 0, 0}
        {0, 0, 0}
        }
        */
        System.out.println("Rows: " + arryGrid1.length);
        System.out.println("Columns: " + arryGrid1[0].length); // Acesses the first array in the grid ({0, 0, 0}) and describes its length

    }

}
