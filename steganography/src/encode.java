import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class encode{

    private BufferedImage img;
    private text txt;

    private void load_image(){

        Scanner scan = new Scanner(System.in);
        System.out.println("give image path:");
        String s = scan.nextLine();
        try {
            this.img = ImageIO.read(new File(s));
        } catch (IOException e){
            e.printStackTrace();
        }


    }

    private void load_text(){
        this.txt = new text();
    }

    private void transformImage(){
        int w = this.img.getWidth()-1;
        int h = this.img.getHeight()-1;
        int i;
        String s = this.txt.getBinstring();
        for(i=0; i < s.length() ; i++){
            int value = this.img.getRGB(w - (i/h), h-(i%h));
            //System.out.println(Character.toString(s.charAt(i)));
            //System.out.println(blue);
            if(Objects.equals(Character.toString(s.charAt(i)), "0")){
                if(value%2 != 0) {
                    value = value - 1;
                    //System.out.println("one became zero, value updated to:" + value);
                }
            } else {
                if(value%2 == 0){
                    value = value + 1;
                    //System.out.println("zero became one, value updated to:" + value);
                }
            }
            this.img.setRGB(w - (i/h), h-(i%h), value);
            //System.out.println("value: "+value+"updated value"+value);
        }
        for(int j =1; j < 9; j++){
            int endpix = this.img.getRGB(w - ((i+j)/h), h-((i+j)%h));
            if(endpix%2 != 0){
                endpix = endpix-1;
            }
            this.img.setRGB(w - ((i+j)/h), h-((i+j)%h), endpix);
        }


    }

    private void saveImage(){
        File file = new File("out.png");
        try{
            ImageIO.write(this.img, "PNG", file);
        } catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){

        encode enc = new encode();
        enc.load_image();
        enc.load_text();
        enc.transformImage();
        enc.saveImage();



    }

}
