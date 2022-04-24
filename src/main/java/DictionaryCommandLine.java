import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandLine {
    static DictionaryManagement myManage = new DictionaryManagement();

    //hàm in ra tất cả các từ đã được thêm vào từ điển và giải nghĩa của nó
    public static void showAllWords(Dictionary myDictionary) {
        System.out.println("No\t| English\t | Vietnamese");
        for (int i = 0; i < myDictionary.words.size(); i++) {
            System.out.print(i + 1);
            System.out.println("\t|" + myDictionary.words.get(i).getWord_target()
                    + "\t\t|" + myDictionary.words.get(i).getWord_explain());
        }
    }

    //hàm có chứ năng gọi hàm insertFromFile() và showAllWord()
    public static void dictionaryBasic() {
        myManage.insertFromCommandline();
        showAllWords(myManage.myDictionary);
    }

    //tìm các từ tiếng Anh chứa các kí tự đã nhập
    public static void dictionarySearcher() {
        System.out.println("Nhập:");
        Scanner myScan = new Scanner(System.in);
        String word = myScan.nextLine().toLowerCase();
        System.out.print("Danh sách các từ vựng có chứa " + word.toUpperCase() + ": ");
        for(int i = 0; i < myManage.myDictionary.words.size(); i++) {
            int temp = myManage.myDictionary.words.get(i).getWord_target().indexOf(word);
            if(temp > -1) {
                System.out.print(myManage.myDictionary.words.get(i).getWord_target() + ", ");
            }
        }
        System.out.print("...");
    }


    //hàm gọi hàm insertFromFile(),showAllWords() và dictionaryLookup()
    public static void dictionaryAdvanced(){
        try {
            myManage.insertFromFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        showAllWords(myManage.myDictionary);
        myManage.dictionaryLookup();
    }

    public static void main(String[] args) {
        //DictionaryCommandLine.dictionaryBasic();
        try {
            DictionaryCommandLine.myManage.insertFromFile();
            Word x = new Word("class", "lớp học");
            DictionaryCommandLine.myManage.addWord(x);
            DictionaryCommandLine.showAllWords(myManage.myDictionary);
            DictionaryCommandLine.myManage.dictionaryLookup();
            DictionaryCommandLine.dictionarySearcher();
            DictionaryCommandLine.myManage.dictionaryExportToFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

