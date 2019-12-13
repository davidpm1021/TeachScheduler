import java.util.Scanner;
//use a hashtable store course id/weight pair values.  use id to search hash table then rank stored values to generate preferences
public class CoursePreferences {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("State the course you wish to enter")
    String preference = keyboard.nextLine();
    do {
        int weight = keyboard.nextInt();
        if(weight < 1) {
            System.out.println("Your answer is invalid");
        }
    } while (weight < = 0);

}
