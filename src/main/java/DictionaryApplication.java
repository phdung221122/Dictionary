import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;


public class DictionaryApplication extends JFrame {
    private JButton searchButton;

    ActionListener searchClick = new inputWord(this);
    JTextField enterYourWord = new JTextField(60);
    JTextField answer = new JTextField();


    //constructor
    public DictionaryApplication() {
        this.runApplication();

        this.setVisible(true);//hiện cửa sổ ra màn hình (tương tự hàm renderPresent trong SDL c++)
    }

    //chạy giao diện đồ họa
    public void runApplication() {
        this.setTitle("Dictionary");//tên giao diện
        this.setSize(400, 400);//chọn kích cỡ cho giao diện
        this.setLocationRelativeTo(null);//căn giữa cửa sổ giao diện
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//tắt hoàn toàn chương trình khi close

        //tạo icon cho giao diện
        Image img = Toolkit.getDefaultToolkit().createImage("DictionaryIcon.png");
        this.setIconImage(img);

        this.arrangeDisplay();
    }

    //bố trí bố cục giao diện
    public void arrangeDisplay(){
        //tạo 1 khoảng để nhập từ

        JPanel wordPanel = new JPanel();//tạo panel của từ muốn tra
        wordPanel.setLayout(new BorderLayout());
        wordPanel.add(enterYourWord, BorderLayout.CENTER);


        searchButton = new JButton("Search");//nút search
        searchButton.addActionListener(searchClick);//add listener

        JPanel buttonPanel = new JPanel();//panel của nút search
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(searchButton);




        this.setLayout(new BorderLayout());
        this.add(wordPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        this.add(answer, BorderLayout.SOUTH);

    }


    public static void main(String[] args) {
        DictionaryApplication test = new DictionaryApplication();

    }
}
