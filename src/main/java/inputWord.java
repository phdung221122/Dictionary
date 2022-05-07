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


        try {
            if(search.equals("En to Vi")) {
                temp.answer.setText(Translator.translate("en", "vi", temp.enterYourWord.getText()));
            }
            if(search.equals("Vi to En")) {
                temp.answer.setText(Translator.translate("vi", "en", temp.enterYourWord.getText()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
