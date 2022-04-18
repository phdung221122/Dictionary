public class DictionaryCommandLine {
    static DictionaryManagement myManage = new DictionaryManagement();
    public static void showAllWords(Dictionary myDictionary) {
        System.out.println("No\t| English\t | Vietnamese");
        for (int i = 0; i < myDictionary.words.size(); i++) {
            System.out.print(i + 1);
            System.out.println("\t|" + myDictionary.words.get(i).getWord_target()
                    + "\t\t|" + myDictionary.words.get(i).getWord_explain());
        }
    }
    public static void dictionaryBasic() {
        myManage.insertFromCommandline();
        showAllWords(myManage.myDictionary);
    }

    /*public static void main(String args[]) {
        DictionaryCommandLine.dictionaryBasic();
    }*/
}

