public class Course {
    //instance variables
    private int id = 0;
    private String name = "";
    private int sections = 0;

    //constructors


    public Course(int id, String name, int sections) {
        this.id = id;
        this.name = name;
        this.sections = sections;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
