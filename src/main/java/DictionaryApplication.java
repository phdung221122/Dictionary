import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DictionaryApplication extends JFrame {
    private searchWord word;
    private JButton searchButton;
    ActionListener ac = new inputWord(this);


    //constructor
    public DictionaryApplication() {
        this.word = new searchWord();
        this.runApplication();
    }

    //chạy giao diện đồ họa
    public void runApplication() {
        this.setTitle("Dictionary");//tên giao diện
        this.setSize(400, 400);//chọn kích cỡ cho giao diện
        this.setLocationRelativeTo(null);//căn giữa cửa sổ giao diện
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//tắt hoàn toàn chương trình khi close
    }

    //tra cứu từ
    public void searchWord(){
        JTextField enterYourWord = new JTextField(60);//tạo 1 khoảng để nhập từ


        JPanel wordPanel = new JPanel();//tạo 1 panel để phân các khu vực
        wordPanel.setLayout(new BorderLayout());
        wordPanel.add(enterYourWord, BorderLayout.CENTER);


        searchButton = new JButton("Search");//nút search
        searchButton.addActionListener(ac);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(searchButton);


        JLabel answer = new JLabel("just test", JLabel.CENTER);


        this.setLayout(new BorderLayout());
        this.add(wordPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.add(answer, BorderLayout.SOUTH);

        this.setVisible(true);//hiện cửa sổ ra màn hình (tương tự hàm renderPresent trong SDL c++)
    }


    public static void main(String[] args) {
        DictionaryApplication test = new DictionaryApplication();
        test.searchWord();
    }
}
