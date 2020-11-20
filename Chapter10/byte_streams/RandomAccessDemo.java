package byte_streams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = {1.1, 2.5, 3.3, 4.4, 5.5, 6.6, 7.7};
        double d;

        try (RandomAccessFile file = new RandomAccessFile("random.dat", "rw")){
            for (int i = 0; i < data.length; i++) {
                file.writeDouble(data[i]);
            }

            file.seek(0);
            System.out.println("First double: " + file.readDouble());

            // Multiply by eight because it counts bytes
            file.seek(3 * 8);
            System.out.println("Third double: " + file.readDouble());

            // Every other value
            for (int i = 0; i < data.length; i += 2) {
                file.seek(i * 8);
                System.out.println(file.readDouble());
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
