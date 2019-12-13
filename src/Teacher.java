public class Teacher extends Person {
    private int numCoursesTaught = 0;
    private String coursePreferences[];


    public Teacher(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public Teacher(String lastName, String firstName, int numCoursesTaught, String[] coursePreferences) {
        super(lastName, firstName);
        this.numCoursesTaught = numCoursesTaught;
        this.coursePreferences = coursePreferences;

    }
}
