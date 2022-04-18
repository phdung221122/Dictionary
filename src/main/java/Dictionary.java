import java.util.ArrayList;

public class Dictionary {
    protected ArrayList<Word> words = new ArrayList<>();

    public void addWord(Word word) {
        this.words.add(word);
    }

}
