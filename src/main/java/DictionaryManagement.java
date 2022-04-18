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
}
