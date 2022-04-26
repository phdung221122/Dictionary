import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.FileWriter;
public class DictionaryManagement {
    protected Dictionary myDictionary = new Dictionary();

    //nhập từ thủ công từ CommandLine
    void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng từ vựng:");
        int repeat = input.nextInt();//số lượng từ nhập vào bán phím
        String fake = input.nextLine();//để bỏ qua dòng trống

        //nhận vào vào từ tiếng anh và giải nghĩa tiếng việt
        for (int i = 0; i < repeat; i++) {
            String english = input.nextLine();
            String vietnamese = input.nextLine();
            Word temp = new Word(english, vietnamese);
            this.myDictionary.words.add(temp);
        }
        input.close();
    }

    //nhập từ sử dụng file dictionaries trong thư mục Dictionary
    public void insertFromFile() throws IOException {
        File fileDir = new File("dictionaries.txt");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir), StandardCharsets.UTF_8));
        String str;
        while ((str = in.readLine()) != null) {
            String[] parts = str.split("-");
            Word temp = new Word(parts[0], parts[1]);
            this.myDictionary.addWord(temp);
        }
        in.close();
    }

    //hàm tra cứu từ điển từ tiếng anh trả về từ tiếng việt bằng dòng lệnh
    public void dictionaryLookup() {
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Nhập vào từ bạn muốn tra");
        String findWord = inputWord.nextLine();
        findWord = findWord.trim();
        Word temp = new Word(findWord, "0");
        int i = myDictionary.words.indexOf(temp);
        if (i < 0) {
            System.out.println("Không có từ bạn nhập trong từ điển của tôi");
        } else {
            System.out.println("Dịch: " + myDictionary.words.get(i).getWord_explain());
        }
    }

    public String dictionaryLookup(String findWord) {
        findWord = findWord.trim();
        Word temp = new Word(findWord, "0");
        int i = myDictionary.words.indexOf(temp);
        String result = null;
        if (i < 0) {
            result = "*Không có từ bạn nhập trong từ điển của tôi*";
        } else {
            result =  myDictionary.words.get(i).getWord_explain();
        }
        return result;
    }
    //thêm từ
    public void addWord(Word x) {
        myDictionary.words.add(x);
    }

    //xóa từ
    public void removeWord(Word x) {
        myDictionary.words.remove(x);
    }

    //xuất dữ liệu ra file out.txt file này đc lưu ở thư mục Dictionary
    public void dictionaryExportToFile() {
       try {
           FileWriter myWriter = new FileWriter("out.txt");
           for (int i = 0; i < myDictionary.words.size(); i++) {
               myWriter.write(myDictionary.words.get(i).getWord_target() + "-" + myDictionary.words.get(i).getWord_explain());
               myWriter.write("\n");
           }
           System.out.println("\nđã viết thành công");
           myWriter.close();
       } catch (IOException e) {
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }

}
