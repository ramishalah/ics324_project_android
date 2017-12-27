package POJO_Classes;

import com.google.gson.annotations.SerializedName;


public class Option4 {

    @SerializedName("InstructorID")
    private int InstructorID ;

    @SerializedName("CourseCode")
    private String courseCode ;

    @SerializedName("Status")
    private String status ;

    public Option4(int instructorID, String courseCode, String status) {
        InstructorID = instructorID;
        this.courseCode = courseCode;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {

        return status;
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
