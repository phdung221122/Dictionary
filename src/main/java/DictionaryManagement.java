import java.io.*;
import java.util.Scanner;

public class DictionaryManagement {
    protected Dictionary myDictionary = new Dictionary();

    void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng từ vựng:");
        int repeat = input.nextInt();
        String fake = input.nextLine();
        for (int i = 0; i < repeat; i++) {
            String english = input.nextLine();
            String vietnamese = input.nextLine();
            Word temp = new Word(english, vietnamese);
            this.myDictionary.words.add(temp);
            //System.out.println(temp.getWord_target() + " " + temp.getWord_explain());
        }
    }

    public void insertFromFile() throws IOException {
        File fileDir = new File("C:\\Users\\ADMIN\\Documents\\Java shit\\Dictionary\\dictionaries.txt");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir), "UTF8"));

        String str;

        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }

        in.close();
    }
}
