package FundamentalLessons.Methods.equals;

public class Password {

    private String secret;

    public Password(String hush){
        
        this.secret = hush;

    }

    public boolean checkBroken(String attempt){
        return attempt == secret; // Incorrect, these are two different objects even if the values are the same
    }

    public boolean check(String attempt){
        return attempt.equals(secret); // Compares values instead of objects
    }

    public boolean sameAs(String other){
        return other.equals(secret);
    }

    public boolean change(String newPass1, String newPass2){
        if(newPass1.equals(newPass2) && !newPass1.equals(secret)){
            this.secret = newPass1;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isSafe(String username){
        return (!(secret.equals("password") || secret.indexOf(username) != -1));
    }

}
