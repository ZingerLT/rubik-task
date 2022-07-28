import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the file name:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        ArrayList<String> testBase = new ArrayList<>();
        boolean start=true;
        while(start == true)
        {
            menu();
            int choose = Integer.parseInt(reader.readLine());
            switch(choose){
                case 1:{
                    System.out.println("Enter field:");
                    String info = reader.readLine();
                    if(testBase.add(info) == true){
                        outputStream.write((info +"\r\n").getBytes());
                        System.out.println("Completed!");}
                    else{
                        System.out.println("No info was written!");}
                    break;
                }
                case 2:{
                    System.out.println("Enter element to delete:");
                    String element = reader.readLine();
                    if(testBase.remove(element)==true){
                    System.out.println("Completed!");}
                    else{
                        System.out.println("No info!");}
                    break;
                }
                case 3:{
                    for (int i = 0; i < testBase.size(); i++) {
                        testBase.remove(i);
                    }
                    System.out.println("Completed!");
                    break;
                }
                case 4:{
                    System.out.println("Enter index:");
                    int num = Integer.parseInt(reader.readLine());
                    System.out.println(testBase.get(num));
                    break;
                }
                case 5:{
                    System.out.print("Enter the file name:");
                    String name = reader.readLine();
                    File doc = new File(name);
                    Scanner obj = new Scanner(doc);
                    while (obj.hasNextLine()){
                        System.out.println(obj.nextLine());
                }
                    break;
                }
                case 0:{
                    System.out.println("Bye!");
                    start=false;
                    outputStream.close();
                    break;
                }
                default:
                    System.out.println("Try one more time!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1 - add");
        System.out.println("2 - delete");
        System.out.println("3 - refresh");
        System.out.println("4 - find by id");
        System.out.println("5 - show info");
        System.out.println("0 - exit");
        System.out.print("Your choose:");
    }
}