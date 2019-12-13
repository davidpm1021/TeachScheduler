public class TeacherScheduler {
    public static void main(String[] args) {
        String courses[] = new String[]{"test", "test", "test"};
        Teacher t1 = new Teacher("Martin", "David", 5, courses);
        System.out.println(t1.getId());
        Teacher t2 = new Teacher("Martin", "David", 5, courses);
        System.out.println(t2.getId());
    }

}
