package FundamentalLessons.Methods.indexOf;

public class Email{

    private String address;

    public Email(String add){
        this.address = add;
    }

    public String toString(){
        return address;
    }

    public int getAtIndex(){
        return address.indexOf("@");
    }

    public String getUser(){
        return address.substring(0, address.indexOf("@"));
    }

    public String getDomain(){
        return address.substring(address.indexOf("@"), -1);
    }

    /*public boolean isSchool(){

    }
    */

}
