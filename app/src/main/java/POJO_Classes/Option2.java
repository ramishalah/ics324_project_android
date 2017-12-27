package POJO_Classes;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User-Sai on 12/18/2017.
 */

public class Option2 {

    @SerializedName("CourseCode")
    private String CourseCode;

    @SerializedName("CourseName")
    private String CourseName;

    public Option2(String ccode, String cname) {
        this.CourseCode = ccode;
        this.CourseName = cname;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setfName(String fName) {
        this.CourseCode = fName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }
}
