public class Course {
    //instance variables
    private int uniqueID = 0;
    private String name = "";
    private int sections = 0;
    private int id = 0;

    //constructors
    public Course(String name) {
        this.id = uniqueID;
        this.name = name;
        this.sections = 5;
        uniqueID++;
    }

    public Course(String name, int sections) {
        this.id = uniqueID;
        this.name = name;
        this.sections = sections;
        uniqueID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSections() {
        return sections;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }
}
