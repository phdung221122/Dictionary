import java.util.ArrayList;

public class Dictionary {
    protected ArrayList<Word> words = new ArrayList<>();//mảng lưu trữ các từ mới + giải nghĩa

    public void addWord(Word word) {
        this.words.add(word);
    }

}
