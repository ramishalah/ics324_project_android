package POJO_Classes;

import com.google.gson.annotations.SerializedName;


public class Option5 {

    @SerializedName("StuID")
    private int id;

    @SerializedName("Fname")
    private String firstName;

    @SerializedName("Lname")
    private String lastName;

    public Option5(int stuId ,String fname, String lname) {
        id = stuId ;
        firstName = fname;
        lastName = lname ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
