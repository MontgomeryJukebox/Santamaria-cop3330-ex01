import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        System.out.println("Hello, " + in.nextLine() + ", nice to meet you!");
    }
}
