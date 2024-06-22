import Encapsulation;

public class Main {
    public static void main(String[] args) {
        CMP202 printUser = new CMP202();
        printUser.printUserDetails();
        // Person student = new Person("Ezra", "Bingham", "01234", "bhu/22/04/05/00132");
        Person staff = new Person("Staff Name", "Bingham", "98765", null, 007);
        System.out.println(staff);
        
        // System.out.println(person.getName());
        // System.out.println(person.setPassword("012345"));;
        // person.password = "12234";
    }
}
