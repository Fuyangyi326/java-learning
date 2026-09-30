public class Book {
    private String author;
    private String title;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("价格不合法:" + price);
            return;
        }
        this.price = price;
    }

    public void info() {
        System.out.println("《" + title + "》 作者：" + author + " 价格：" + price + " 元");
    }
}