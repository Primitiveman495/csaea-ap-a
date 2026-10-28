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

    public String getFirstName(){
        return address.substring(0, address.indexOf("."));
    }

    public String changeDomain(String newDomain){
        return this.getUser() + "@" + newDomain;
    }

    public boolean isSchool(){
        return address.indexOf("hcvsd.org") != -1;
    }

    public String getLabel(){
        if(this.isSchool()){
            return "School: " + this.getDomain();
        }
        else{
            return "Personal: " + this.getDomain();
        }
    }

    public boolean isStaffFormat(){
        return ((this.toString().indexOf("hcvsd.org") != -1) && (this.toString().indexOf(".")) != -1);
    }
    

}
