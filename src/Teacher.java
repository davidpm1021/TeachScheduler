public class Teacher extends Person {
    private int coursesTaught = 0;
    private String coursePreferences[];


    public Teacher(int id, String lastName, String firstName) {
        super(id, lastName, firstName);
    }

    public Teacher(int id, String lastName, String firstName, int coursesTaught, String[] coursePreferences) {
        super(id, lastName, firstName);
        this.coursesTaught = coursesTaught;
        this.coursePreferences = coursePreferences;
    }
}
