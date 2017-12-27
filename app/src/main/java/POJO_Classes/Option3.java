package POJO_Classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User-Sai on 12/20/2017.
 */

public class Option3 {

    private int InstructorID ;
    private String courseCode ;

    public Option3(int instructorID, String courseCode) {
        InstructorID = instructorID;
        this.courseCode = courseCode;
    }

    public void setInstructorID(int instructorID) {
        InstructorID = instructorID;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getInstructorID() {

        return InstructorID;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
