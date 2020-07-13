package Library;

import java.util.Scanner;

public class Main extends Thread{
    private static String status;       //获取触发当前事件的字符
        public static void main(String[] args) {

            BookOut bookOut = new BookOut();    //借书
            BookBack bookBack = new BookBack(); //还书
            Thread back = new Thread(bookBack, "Borrow：");
            Thread come = new Thread(bookOut, "Return：");

            System.out.println("借书输入‘o’；还书输入‘b’");
            Scanner scan=new Scanner(System.in);
            status=scan.next();
            //开启线程
            back.start();
            come.start();

            do {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                status = scan.next();       //读入字符
            } while (true);

    }
    public synchronized static String getStatus(){
            return status;
    }
    public synchronized static void setStatus(String str){
            status=str;
    }
}