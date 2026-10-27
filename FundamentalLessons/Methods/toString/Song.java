package FundamentalLessons.Methods.toString;
/*
 * Song: blueprint for Song objects.
 * New method: toString()
 *
 * toString() returns a String that describes an object.
 * Header -- copy it exactly:   public String toString()
 * It RETURNS text. It does not print.
 */

public class Song {

    private String title;
    private String artist;
    private String stars;
    private int plays;

    public Song(String t, String a){

        this.title = t;
        this.artist = a;
        plays = 0;
        stars = 0;

    }

    public void play(){
        plays++;
    }

    public int getPlays(){
        return plays;
    }

    public String toString(){
        if(plays == 1){
            return title + " by " + artist + " - 1 play";
        }
        else{
            return title + " by " + artist + " - " + plays + "plays";
        }
    }

    public String getStars(){
        for(int i = 0; plays != i; i++){
            stars = stars + "*";
        }
        return stars;
    }
    
}