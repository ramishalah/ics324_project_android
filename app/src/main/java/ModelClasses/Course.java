package ModelClasses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User-Sai on 12/16/2017.
 */

public class Course {

    @SerializedName("CourseCode")
    private String courseCode ;

    @SerializedName("CourseName")
    private String courseName ;

    @SerializedName("CreditHours")
    private int creditHours;


}
