public class Person {
    private String lastName = "";
    private String firstName = "";
    private int uniqueID = 0;
    private int id = 0;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public Person(String lastName, String firstName) {
        this.id = uniqueID;
        this.lastName = lastName;
        this.firstName = firstName;
        uniqueID++;
    }
}
