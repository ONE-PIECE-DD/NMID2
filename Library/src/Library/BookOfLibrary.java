package Library;

public class BookOfLibrary{
    private static int NumberOfBook=1;//初始化库存中的书籍数目

    public synchronized int getNumberOfBook() {
        return NumberOfBook;
    }

    public  void setNumberOfBook(int numberOfBook) {
        NumberOfBook = numberOfBook;
    }

    public void bookback(){//有人还书
        if(NumberOfBook <3) {
            NumberOfBook ++;
        }
    }

    public void bookout(){//有人借书
        if(NumberOfBook>0) {
            NumberOfBook--;
        }
    }

    public void PrintTheStatus(){
        if(NumberOfBook <3&&NumberOfBook>0){
            System.out.println(Thread.currentThread().getName() + "图书馆剩余书本数量：" + NumberOfBook + "本书");
        }
        else if (NumberOfBook==3){
            System.out.println(Thread.currentThread().getName() + "库存为3，库存已满，无需还书！");
        }
        else
            System.out.println(Thread.currentThread().getName()+"库存为0，当前没有可借书籍。");

    }

}
