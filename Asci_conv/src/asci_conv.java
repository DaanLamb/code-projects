package Asci_conv;
import java.util.Objects;
import java.util.Scanner;

public class asci_conv {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("word: ");
        String s = scan.nextLine();
        while(!Objects.equals(s, "exit")) {

            char[] chars = s.toCharArray();
            for (char ch : chars) {
                System.out.print((int) ch + ", ");
            }
            System.out.print(System.lineSeparator());


            System.out.println("word: ");
            s = scan.nextLine();
        }

    }
}
