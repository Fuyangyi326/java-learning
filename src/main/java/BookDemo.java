public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java 编程思想", "Bruce Eckel", 108);
        Book b2 = new Book("算法导论", "Cormen", 128);

        b1.info();
        b2.info();
        b1.setPrice(99);
        System.out.println("b1 新价格：" + b1.getPrice());

        b1.setPrice(-10);        
        System.out.println("b1 价格：" + b1.getPrice());
    }
}
