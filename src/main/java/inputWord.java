import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inputWord implements ActionListener {
    private DictionaryApplication word;
    public inputWord(DictionaryApplication word) {
        this.word = word;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("test succeed");
    }
}
