import javax.swing.*;
import java.awt.*;

public class DictionaryApplication extends JFrame {
    public DictionaryApplication(){
        JLabel label = new JLabel("fuck word", SwingConstants.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(new Font(Font.SERIF , Font.ITALIC, 40));
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(label);
    }

    public static void main(String[] args) {
        new DictionaryApplication().setVisible(true);
    }
}
