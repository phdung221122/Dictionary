import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        FileInputStream myFile = new FileInputStream("C:\\Users\\ADMIN\\Documents\\Java shit\\Dictionary\\dictionaries.txt");
        try {
            int i = 0;
            while ((i = myFile.read()) != -1) {
                System.out.print((char) i);
            }
            myFile.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            myFile.close();
        }
    }
}
