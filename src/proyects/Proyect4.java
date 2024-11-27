package proyects;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Scanner;

public class Proyect4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la ruta de la imagen:");
        String imagePath = sc.nextLine();

        BufferedImage image;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            sc.close();
            return;
        }

        System.out.println("Ingresa el color en formato hexadecimal (por ejemplo, #FF5733):");
        String hexColor = sc.next();

        Color filterColor;
        try {
            filterColor = Color.decode(hexColor);
        } catch (NumberFormatException e) {
            System.out.println("Color hex inválido.");
            sc.close();
            return;
        }

        int red = filterColor.getRed();
        int green = filterColor.getGreen();
        int blue = filterColor.getBlue();

        int width = image.getWidth();
        int height = image.getHeight();

        int[][][] imageMatrix = new int[width][height][3];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixel = image.getRGB(x, y);
                Color originalColor = new Color(pixel);
                imageMatrix[x][y][0] = originalColor.getRed();
                imageMatrix[x][y][1] = originalColor.getGreen();
                imageMatrix[x][y][2] = originalColor.getBlue();
            }

        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int newRed = (imageMatrix[x][y][0] + red) / 2;
                int newGreen = (imageMatrix[x][y][1] + green) / 2;
                int newBlue = (imageMatrix[x][y][2] + blue) / 2;
                imageMatrix[x][y][0] = newRed;
                imageMatrix[x][y][1] = newGreen;
                imageMatrix[x][y][2] = newBlue;
            }

        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int newRed = imageMatrix[x][y][0];
                int newGreen = imageMatrix[x][y][1];
                int newBlue = imageMatrix[x][y][2];
                Color newColor = new Color(newRed, newGreen, newBlue);
                image.setRGB(x, y, newColor.getRGB());
            }

        }

        System.out.println("Ingresa la ruta para guardar la imagen filtrada:");
        String outputPath = sc.next();
        sc.close();

        try {
            ImageIO.write(image, "jpg", new File(outputPath));
            System.out.println("¡Filtro aplicado y imagen guardada!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
