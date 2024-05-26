package testing;
import swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Test {
    
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("E:\\HOCTAP\\KI2\\Java\\cuoiki\\ProjectJava\\test\\testing\\cat.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
