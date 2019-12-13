/*To Do:

Create a class that generates schedule for teachers based on (in order) must teach classes, then top preference,
then second class with a preference for 2 PLCs

Create a class that takes current teacher schedule and programs them into classroom with a preference for teachers that have
required classes, then teachers that have "assigned rooms" then floating teachers

Parse excel spreadsheet to import course list and number of sections
Parse excel spreadsheet to import teacher preferences from a google sheet into an array
Parse excel spreadsheet to import teacher names
GUI
*/

/* Done -
    Person class initializes last name, first name, and unique id (constructors, setters and getters done for all three)
    Teacher class inherits last, first, id, and adds course preference array and a counter for courses taught
    Course class initializes id, name and number of sections
    Figure out how to initialize an array for each teacher to save their current courses
Do teachers need a separate variable for current schedule?  Probably
Same problem from Room availability
*/

/*After the program is open
Teachers generated
rooms generated
courses generated
teachers choose courses and weighting - teachers indicate any courses that they are the only qualified to teach.  this c
    counts for half of available points (5 out of 10).  Teachers should pick 3 classes, assigning at least 1 point to each)
flags made for teachers into classroom
flags made for classes that must be in rooms
flags made for teachers that should be prioritized into "their classroom"
all input into scheduler class for sorting

 */

public class TeacherScheduler {
    public static void main(String[] args) {
        //check that Teacher creation and id generator work
        String courses[] = new String[]{"test", "test", "test"};
        Teacher teacher1 = new Teacher("Teacher", "Joe");
        Teacher teacher2 = new Teacher("Teacher", "Jane");

        //test that course creation and id works
        Course course1 = new Course("Algebra 2R", 7);
        Course course2 = new Course("Algebra 2A", 9);

        //test that room creation and id works
        Room room1 = new Room("C210");
        Room room2 = new Room("C201");

        //set course preferences for teacher1 and teacher2

    }


}
