package ModelClasses;


import com.google.gson.annotations.SerializedName;

public class Section {

    @SerializedName("CRN")
    private int crn ;

    @SerializedName("Term")
    private int term ;

    @SerializedName("CourseCode")
    private String courseCode ;

    @SerializedName("SecNo")
    private int secNo ;

    @SerializedName("Instructor")
    private int instructorId ;

    @SerializedName("BldNo")
    private int bldNo ;

    @SerializedName("RoomNo")
    private int roomNo ;

    @SerializedName("Days")
    private String days ;

    @SerializedName("StartTime")
    private String startTime ;

    @SerializedName("EndTime")
    private String endTime ;

    @SerializedName("Enrolled")
    private boolean enrolled ;

    @SerializedName("Capacity")
    private int capacity ;

    public Section(){

    }

    public Section(int crn, int term, String courseCode,
                   int secNo, int instructorId, int bldNo, int roomNo, String days,
                   String startTime, String endTime, boolean enrolled, int capacity) {
        this.crn = crn;
        this.term = term;
        this.courseCode = courseCode;
        this.secNo = secNo;
        this.instructorId = instructorId;
        this.bldNo = bldNo;
        this.roomNo = roomNo;
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.enrolled = enrolled;
        this.capacity = capacity;
    }

    public Section(int crn, int term) {
        this.crn = crn;
        this.term = term;
    }

    public int getCrn() {
        return crn;
    }

    public int getTerm() {
        return term;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getSecNo() {
        return secNo;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public int getBldNo() {
        return bldNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getDays() {
        return days;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Section{" +
                "crn=" + crn +
                ", term=" + term +
                ", courseCode='" + courseCode + '\'' +
                ", secNo=" + secNo +
                ", instructorId=" + instructorId +
                ", bldNo=" + bldNo +
                ", roomNo=" + roomNo +
                ", days='" + days + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", enrolled=" + enrolled +
                ", capacity=" + capacity +
                '}';
    }
}
