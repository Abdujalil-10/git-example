package task_5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Yakkasaroy","Shota Rustaveli");
        User user = new User("Abdujalil",19,address);
        System.out.println(user);
    }
}
