
/**
 * Write a description of class imageMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class imagemaker extends Component
{
public static void main(String[]foo){
new imagemaker();
}
public void printpixels(int pixel){
int alpha=(pixel>>24)&0xff;
int red=(pixel>>16)&0xff;
int green=(pixel>>8)&0xff;
int blue=(pixel)&0xff;
//System.out.print(pixel+","+alpha+","+red+","+green+","+blue);
if(pixel==-1){
    System.out.print("1");
}
else{
    System.out.print("0");
}
}
private void gothroughimage(BufferedImage image){
int width=image.getWidth();
int height=image.getHeight();
//System.out.println("width,hieght"+width+","+height);
for(int i=0;i<height;i++){
 for(int j=0;j<width;j++){
    //System.out.println("x,y"+j+","+i);
    int pixel=image.getRGB(j,i);
    printpixels(pixel);
   // System.out.println("");
}
System.out.println("");
}
}
public imagemaker(){
try{
BufferedImage image=ImageIO.read(new File("circle3.png"));
gothroughimage(image);
}catch(IOException e){
System.err.println(e.getMessage());
}
}
}
