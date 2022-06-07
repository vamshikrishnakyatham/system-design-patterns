package BuilderDesignPattern;
public class MainClass {
    public static void main(String[] args) {
        NewStudent student = new NewStudent.StudentBuilder("Vamshi", "Krishna").addisGraduate(true).addGender("M").addHasExperience(true).addCity("Hyderabad").addState("Telangana").build();
        System.out.println(student);
    }
}