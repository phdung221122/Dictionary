import javax.swing.*;
import java.awt.*;

public class DictionaryApplication extends JFrame {

    //constructor
    public DictionaryApplication() {
        this.setTitle("Dictionary");//tên giao diện
        this.setSize(400, 400);//chọn kích cỡ cho giao diện
        this.setLocationRelativeTo(null);//căn giữa cửa sổ giao diện
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//tắt hoàn toàn chương trình khi close

    }


    public void runApplication() {
        /*JLabel label = new JLabel("just test", SwingConstants.CENTER);// hiển thị từ muốn đưa ra màn hình
        label.setForeground(Color.BLUE);//chọn màu
        label.setFont(new Font(Font.SERIF , Font.ITALIC, 40));//chọn font và cỡ chữ
        this.add(label);//tương tự hàm renderCopy trong SDL c++*/
        JTextField enterYourWord = new JTextField(16);//tạo 1 khoảng để nhập từ


        JPanel wordPanel = new JPanel();//tạo 1 panel để phân các khu vực
        wordPanel.setLayout(new BorderLayout());
        wordPanel.add(enterYourWord);
        this.add(wordPanel, BorderLayout.CENTER);

        FlowLayout aButton = new FlowLayout(FlowLayout.CENTER, 50, 50);//tạo nút bấm
        this.setLayout(new FlowLayout());
        JButton searchButton = new JButton("Search");//nút search
        this.add(searchButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());

        buttonPanel.add(searchButton);
        this.add(buttonPanel, BorderLayout.CENTER);

        this.setVisible(true);//hiện cửa sổ ra màn hình (tương tự hàm renderPresent trong SDL c++)
    }


    public static void main(String[] args) {
        DictionaryApplication test = new DictionaryApplication();
        test.runApplication();

    }
}
