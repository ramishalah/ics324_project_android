package POJO_Classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User-Sai on 12/18/2017.
 */

public class Option1 {

    @SerializedName("FirstName")
    private String FirstName ;

    @SerializedName("Lname")
    private String Lname;

    public Option1(String fName, String lName) {
        this.FirstName = fName;
        this.Lname = lName;
    }

    public String getfName() {
        return FirstName;
    }

    public String getLname() {
        return Lname;
    }

    public void setfName(String fName) {
        this.FirstName = fName;
    }

    public void setLname(String lname) {
        this.Lname = lname;
    }
}
