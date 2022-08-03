import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DB db = new DBImpl();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while(work == true)
        {
            menu();
            int choose = scanner.nextInt();
            switch(choose){
                case 1:{
                    System.out.print("Enter name:");
                    String name = scanner.next();
                    System.out.print("Enter password:");
                    String password = scanner.next();
                    User user = new User(name,password);
                    db.addUser(user);
                    System.out.println("Completed!");
                    break;
                }
                case 2:{
                    System.out.print("Enter user_id to delete:");
                    int id = scanner.nextInt();
                    db.deleteUser(id);
                    System.out.println("Completed!");
                    break;
                }
                case 3:{
                    System.out.print("Enter user_id to find:");
                    int id = scanner.nextInt();
                    System.out.println(db.findById(id));
                    break;
                }

                case 4:{
                    System.out.println(db.getAll());
                    break;
                }
                case 0:{
                    work = false;
                    System.out.println("Bye!");
                    break;
                }
            }

        }
    }
    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1 - add");
        System.out.println("2 - delete");
        System.out.println("3 - find by id");
        System.out.println("4 - show info");
        System.out.println("0 - exit");
        System.out.print("Your choose:");
    }
}
