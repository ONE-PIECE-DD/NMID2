# NMID2
第三周编程作业：模拟图书馆借书还书过程
Book.java:没用。
BookOfLibrary.java:创建借书还书的父类，提供访问当前库存书籍、对当前库存书籍进行操作、打印当前状态的方法。
BookBack:继承父类实现Runnable接口，为还书线程。
BookOut:继承父类实现Runnable接口，为借书线程。
Main.java:实现上述两个子类，同时获取标志借书还书事件的字符，也为两个子类提供获取标志当前事件状态的方法。
