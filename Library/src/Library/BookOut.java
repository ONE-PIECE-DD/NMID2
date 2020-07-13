package Library;

import static Library.Main.getStatus;
import static Library.Main.setStatus;

public class BookOut extends BookOfLibrary implements Runnable{//继承父类、实现接口
    @Override
    public void run() {//重写run（）方法
        while (true) {
            if (getNumberOfBook() > 0 && getStatus().equals("o")) {//判断能否借书、能否借书出去
                setStatus("N");
                bookout();
                PrintTheStatus();
            }
        }

    }
}
