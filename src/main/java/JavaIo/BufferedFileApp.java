package JavaIo;

import java.io.*;

public class BufferedFileApp {
    private static final String RESOURCE_FOLDER = "src/main/java/JavaIo/resource";

    public static void main(String[] args) {
        File file2 = new File(RESOURCE_FOLDER + "test.txt");
        try {
            FileWriter file1 = new FileWriter(file2,true);
            BufferedWriter bw = new BufferedWriter(file1);
            bw.write("Hello Brat Netersen");
            bw.write("Salam Olsun Brattttt");
            bw.close();
            file1.close();

        } catch (IOException e) {
            System.out.println("Io exception is here");
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not be able to read file!");
            e.printStackTrace();
        }

    }
}
