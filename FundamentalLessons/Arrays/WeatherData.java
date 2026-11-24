import java.util.ArrayList;

public class WeatherData {

    private ArrayList<Double> temps;

    public void cleanData(double low, double high){
        for(int i = temps.size() - 1; i >= 0; i--){
            if(temps.get(i) < low || temps.get(i) > high){
                temps.remove(i);
            }
        }
    }
    public int longestHotStreak(double limit){
        int hotStreak = 0;
        int greatestHotStreak = 0;
        for(int i = 0; i < temps.size(); i++){
            if(temps.get(i) > limit){
                hotStreak++;
            }
            else{
                if(greatestHotStreak < hotStreak){
                    greatestHotStreak = hotStreak;
                }
                hotStreak = 0;
            }
        }
        if(greatestHotStreak < hotStreak){
            greatestHotStreak = hotStreak;
        }
        return greatestHotStreak;
    }

}