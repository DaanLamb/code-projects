import java.util.Scanner;

public class text {
    private String str;
    private char[] chars;
    private String bin;

    public text(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Text to be encoded:");
        this.str = scan.nextLine();
        this.chars = this.str.toCharArray();
        this.bin = "";

        for(char ch : this.chars){
            this.bin += Integer.toBinaryString((int) ch);
        }
    }

    public String getBinstring(){
        return this.bin;
    }
}
