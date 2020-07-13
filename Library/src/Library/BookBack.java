package Library;
import static Library.Main.getStatus;
import static Library.Main.setStatus;
public class BookBack extends BookOfLibrary implements Runnable{//继承父类、实现接口
    @Override
    public void run() {//重写run（）方法
        while (true) {
            if (getStatus().equals("b") && getNumberOfBook() < 3) {//判断是否是还书、能否接受还的书
                setStatus("N");
                bookback();
                PrintTheStatus();
            }

        }

    }
}

