import java.io.IOException;

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

    public static void main(String args[]) {
        //DictionaryCommandLine.dictionaryBasic();
        try {
            DictionaryCommandLine.myManage.insertFromFile();
            Word x = new Word("class", "lớp học");
            DictionaryCommandLine.myManage.addWord(x);
            DictionaryCommandLine.showAllWords(myManage.myDictionary);
            DictionaryCommandLine.myManage.dictionaryLookup();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

