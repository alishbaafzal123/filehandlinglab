import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\maryam shbana\\IdeaProjects\\filehandlinglab\\src\\email.txt.csv"));
        ArrayList<String> list = new ArrayList<>();
        boolean b = false;
        String str;
        while ((str = br.readLine()) != null) {

            list.add(str);
            //System.out.println(str);

        }

        System.out.println("PRINTING ARRAY LIST");
        for (String a : list)
            System.out.println(a);
        System.out.println("Enter text to search");
        Scanner scanner = new Scanner(System.in);

        String ui = scanner.nextLine();


        for (String a : list) {

            ui.equals(a);
            b= true;
        }
        if (b)
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");

    }


    //FileInputStream fis = new FileInputStream("D:\\Amer-Backup\\TAHA\\JAVA Projects\\LAB 8\\src\\TAHA.txt");
    //String str;
    //while ((str = String.valueOf(fis.read())) != null) {

    //System.out.println(str);

    //File file = new File("D:\\Amer-Backup\\TAHA\\JAVA Projects\\LAB 8\\src\\NewOne.txt");

    //FileWriter fw = new FileWriter("D:\\Amer-Backup\\TAHA\\JAVA Projects\\LAB 8\\src\\NewOne.txt");
}