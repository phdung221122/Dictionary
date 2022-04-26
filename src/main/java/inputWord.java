import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class inputWord implements ActionListener {
    private DictionaryApplication temp;
    public inputWord(DictionaryApplication temp) {
        this.temp = temp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String search = e.getActionCommand();


        try {
            DictionaryCommandLine.myManage.insertFromFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        temp.answer.setText(DictionaryCommandLine.myManage.dictionaryLookup(temp.enterYourWord.getText()));
    }
}
