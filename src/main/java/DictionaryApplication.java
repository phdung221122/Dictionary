import javax.swing.*;
import java.awt.*;

public class DictionaryApplication extends JFrame {
    public DictionaryApplication(){

    }//constructor

    public void runApplication(){
        JLabel label = new JLabel("just test", SwingConstants.CENTER);// hiển thị từ muốn đưa ra màn hình
        label.setForeground(Color.BLUE);//chọn màu
        label.setFont(new Font(Font.SERIF , Font.ITALIC, 40));//chọn font
        this.setSize(400, 400);//chọn size
        this.setTitle("just test");//hiển thị tên giao diện
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//tắt hoàn toàn chương trình khi close
        this.setLocationRelativeTo(null);//chỉnh cửa sổ giữa màn hình
        this.add(label);//tương tự hàm renderCopy trong SDL c++
        this.setVisible(true);//hiện cửa sổ ra màn hình (tương tự hàm renderPresent trong SDL c++)
    }


    public static void main(String[] args) {
        DictionaryApplication test = new DictionaryApplication();
        test.runApplication();
    }
}
