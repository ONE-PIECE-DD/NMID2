package Library;

public class Book {
    private String NameOfBook;
    private int TimeOfBorrow;
    private int TimeOfReturn;
    private String NameOfBorrower;


    public Book(String nameOfBook, int timeOfBorrow, int timeOfReturn, String nameOfBorrower) {
        NameOfBook = nameOfBook;
        TimeOfBorrow = timeOfBorrow;
        TimeOfReturn = timeOfReturn;
        NameOfBorrower = nameOfBorrower;
    }

    public Book() {
    }

    public int getTimeOfReturn() {
        return TimeOfReturn;
    }

    public void setTimeOfReturn(int timeOfReturn) {
        TimeOfReturn = timeOfReturn;
    }

    public String getNameOfBorrower() {
        return NameOfBorrower;
    }

    public void setNameOfBorrower(String nameOfBorrower) {
        NameOfBorrower = nameOfBorrower;
    }

    public int getTimeOfBorrow() {
        return TimeOfBorrow;
    }

    public void setTimeOfBorrow(int timeOfBorrow) {
        TimeOfBorrow = timeOfBorrow;
    }

    public String getNameOfBook() {
        return NameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        NameOfBook = nameOfBook;
    }
}
