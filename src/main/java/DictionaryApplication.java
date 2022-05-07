import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;


public class DictionaryApplication extends JFrame {
    public JPanel contentPane;
    public JTextPane enterYourWord = new JTextPane();
    JTextPane answer = new JTextPane();
    JButton searchButton = new JButton("Search Button");
    JLabel test = new JLabel();
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

        //tạo 1 scroll pane cho thanh nhập từ
        JScrollPane enterYourWordScrollPane = new JScrollPane();
        panel.add(enterYourWordScrollPane, BorderLayout.CENTER);

        enterYourWordScrollPane.setViewportView(enterYourWord);
        enterYourWord.setFont(font);

        //panel lưu 2 nút bấm dịch
        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(Color.WHITE);
        searchPanel.setBounds(76, 220, 306, 35);
        contentPane.add(searchPanel);
        searchPanel.setLayout(new BorderLayout(0, 0));

        //nút dịch tiếng việt sang anh
        JButton viSearch = new JButton("Vi to En");
        searchPanel.add(viSearch, BorderLayout.EAST);
        viSearch.setFont(font);
        viSearch.addActionListener(searchClick);

        //nút dịch tiếng anh sang việt
        JButton enSearch = new JButton("En to Vi");
        searchPanel.add(enSearch, BorderLayout.WEST);
        enSearch.setFont(font);
        enSearch.addActionListener(searchClick);

        JLabel vflatLogo = new JLabel("");
        vflatLogo.setIcon(new ImageIcon("VFlat.png"));
        vflatLogo.setBounds(-146, 0, 717, 199);
        contentPane.add(vflatLogo);

        //tạo 1 scroll pane cho thanh hiện ra kết quả
        JScrollPane answerScrollPane = new JScrollPane();
        answerScrollPane.setBounds(68, 268, 367, 285);
        contentPane.add(answerScrollPane);

        answer.setBounds(68, 268, 367, 285);
        contentPane.add(answer);
        answer.setFont(font);
        answer.setEditable(false);
        answerScrollPane.setViewportView(answer);


        //mũi tên chỉ vào kết quả
        JLabel arrowHead = new JLabel("");
        arrowHead.setIcon(new ImageIcon("definition.png"));
        arrowHead.setBounds(10, 263, 48, 41);
        contentPane.add(arrowHead);

    }
}
