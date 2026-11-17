import java.util.Arrays;

public class NativeArrays {
    public static void main(String[] args){
    
        int[] scores = new int[5];
        String[] names = new String[6];
        boolean[] flags = new boolean[3];
        double[] weights = new double[8];

        System.out.println("Integer Default: " + Arrays.toString(scores));
        System.out.println("String Default: " + Arrays.toString(names));
        System.out.println("Boolean Default: " + Arrays.toString(flags));
        System.out.println("Double Default: " + Arrays.toString(weights));

        scores[2] = 83;
        System.out.println(scores[2]);

        int[] nums = {0, 3, 4, 7, 2, 8};

        for(int i : nums){
            System.out.println("Enhanced Value: " + i);
        }

        for(int i : nums){
            System.out.println("Doubled Value:" + (i * 2));
        }

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                System.out.println(i + 10);
            }
            else{
                System.out.println(i);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i < 0){
                nums[i] = 0;
            }
        }

        int[] testScores = {85, 62, 97, 45, 70, 99};

        for(int i = 0; i < testScores.length; i++){
            if(nums[i] > 95){
                nums[i] = 100;
            }
            else{
                nums[i] += 5;
            }
        }

        int[] temps = {58, 71, 64, 80, 77, 69};
        int highestTemp = temps[0];
        int highestTempIndex = 0;

        for(int i = 1; i < testScores.length; i++){
            highestTemp = Math.max(temps[i], highestTemp);
            if(highestTemp == nums[i]){
                highestTempIndex = 0;
            }
        }
        System.out.println(highestTemp + highestTempIndex);
    
    }
}