/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Admin
 */
public class ImageHelper {
    public static Image resize(Image originalImage,int targetWith,int targetHeight){
        Image resultImage =originalImage.getScaledInstance(targetWith, targetHeight,Image.SCALE_SMOOTH);
        return  resultImage;
    }
    public static byte[] toByteArray(Image image,String type) throws IOException{
        BufferedImage bimage = new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bimage.createGraphics();
        g.drawImage(image, 0, 0,null);
        g.dispose();
        ByteArrayOutputStream baos =new ByteArrayOutputStream();
        ImageIO.write(bimage, type, baos);
        byte[] imageInByte =baos.toByteArray();
        return imageInByte;
    }
    public static Image createImageFromByteArray(byte[] data,String type) throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bimage2 = ImageIO.read(bis);
        Image img = bimage2.getScaledInstance(bimage2.getWidth(),bimage2.getHeight(), Image.SCALE_SMOOTH);
        return img;
    }
}
