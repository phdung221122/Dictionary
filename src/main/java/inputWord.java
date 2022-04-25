import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inputWord implements ActionListener {
    private DictionaryApplication temp;
    public inputWord(DictionaryApplication temp) {
        this.temp = temp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String search = e.getActionCommand();
        temp.input=temp.enterYourWord.getText();

            temp.answer.setText(temp.input);

    }
}
