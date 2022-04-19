public class Word {
    private String word_target;//từ mới tiếng anh
    private String word_explain;//giải nghĩa tiếng việt

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public Word(String x, String y) {
        this.word_target = x;
        this.word_explain = y;
    }
}
