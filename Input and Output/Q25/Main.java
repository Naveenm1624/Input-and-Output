import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        System.out.println(address.replace(" ", "\n"));  // converts every space into a new line.
    }
}
