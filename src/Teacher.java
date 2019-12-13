public class Teacher extends Person {
    private int numCoursesTaught = 0;
    private String coursePreferences[];
    private String currentSchedule[];

    public String[] getCurrentSchedule() {
        return currentSchedule;
    }

    public void setCurrentSchedule(String[] currentSchedule) {
        this.currentSchedule = currentSchedule;
    }

    public Teacher(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public Teacher(String lastName, String firstName, String[] coursePreferences) {
        super(lastName, firstName);
        this.coursePreferences = coursePreferences;

    }

    public int getNumCoursesTaught() {
        return numCoursesTaught;
    }

    public void setNumCoursesTaught(int numCoursesTaught) {
        this.numCoursesTaught = numCoursesTaught;
    }

    public String[] getCoursePreferences() {
        return coursePreferences;
    }

    public void setCoursePreferences(String[] coursePreferences) {
        this.coursePreferences = coursePreferences;
    }
}
