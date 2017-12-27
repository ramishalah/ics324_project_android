package ModelClasses;


import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("StuID")
    private int id ;

    @SerializedName("Fname")
    private String firstName ;

    @SerializedName("Lname")
    private String lastName ;

    public Student(){

    }

    public Student(int id){
        this.id = id ;
        firstName = "";
        lastName = "";
    }

    public Student(int id,String fname, String lname){
        this.id = id ;
        firstName = fname;
        lastName = lname;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
