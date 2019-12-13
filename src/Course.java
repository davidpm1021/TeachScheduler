public class Course {
    //instance variables
    private int uniqueID = 0;
    private String courseName = "";
    private int sections = 0;
    private int id = 0;

    //constructors
    public Course(String name) {
        this.id = uniqueID;
        this.courseName = name;
        this.sections = 5;
        uniqueID++;
    }

    public Course(String name, int sections) {
        this.id = uniqueID;
        this.courseName = name;
        this.sections = sections;
        uniqueID++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public int getSections() {
        return sections;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
