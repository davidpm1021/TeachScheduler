public class Teacher extends Person {
    private int coursesTaught = 0;
    private String coursePreferences[];


    public Teacher(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public Teacher(String lastName, String firstName, int coursesTaught, String[] coursePreferences) {
        super(lastName, firstName);
        this.coursesTaught = coursesTaught;
        this.coursePreferences = coursePreferences;
    }
}
