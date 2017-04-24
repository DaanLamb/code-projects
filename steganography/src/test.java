import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("give chars:");
        String s = scan.nextLine();

        char[] chars = s.toCharArray();

        for (char ch : chars) {

            System.out.print(Integer.toBinaryString((int) ch) + ", ");
        }
        /*
        String s = "daan";
        char[] chars = s.toCharArray();
        String bs = Integer.toBinaryString((int) chars[0]);

        if(Objects.equals(Character.toString(bs.charAt(0)), "0"){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        */
    }
}
