import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;


public class DictionaryApplication extends JFrame {
    public JPanel contentPane;
    public JTextField enterYourWord;
    //public JLabel answer = new JLabel("\r\n");
    JTextPane answer = new JTextPane();
    JButton searchButton = new JButton("");
    Font font = new Font("Arial", Font.BOLD, 12);
    ActionListener searchClick = new inputWord(this);
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DictionaryApplication frame = new DictionaryApplication();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public DictionaryApplication() {
        setBackground(Color.WHITE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("dictionaryIcon.png"));
        setTitle("VFlat Dictionary");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setForeground(Color.CYAN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(27, 107, 408, 35);
        contentPane.add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JLabel alphabetImage = new JLabel("");
        panel.add(alphabetImage, BorderLayout.WEST);
        alphabetImage.setIcon(new ImageIcon("abc.png"));

        enterYourWord = new JTextField();
        panel.add(enterYourWord, BorderLayout.CENTER);
        enterYourWord.setColumns(10);
        enterYourWord.setFont(font);


        panel.add(searchButton, BorderLayout.EAST);
        searchButton.setIcon(new ImageIcon("searchButton.png"));
        searchButton.addActionListener(searchClick);

        JLabel vflatLogo = new JLabel("");
        vflatLogo.setIcon(new ImageIcon("VFlat.png"));
        vflatLogo.setBounds(-146, 0, 717, 199);
        contentPane.add(vflatLogo);


        //answer.setBounds(68, 209, 381, 35);
        //contentPane.add(answer);
        answer.setBounds(68, 268, 367, 285);
        contentPane.add(answer);
        answer.setFont(font);


        JLabel arrowHead = new JLabel("");
        arrowHead.setIcon(new ImageIcon("definition.png"));
        //arrowHead.setBounds(10, 203, 48, 41);
        arrowHead.setBounds(10, 263, 48, 41);
        contentPane.add(arrowHead);
    }
}
