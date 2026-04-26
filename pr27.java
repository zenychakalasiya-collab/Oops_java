import java.io.*;
public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter("students.txt");
            fw.write("1 Zeny 90\n");
            fw.write("2 Yug 95\n");
            fw.write("3 Darshi 81\n");
            fw.close();
            br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
