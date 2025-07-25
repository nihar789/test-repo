public class Day20_Task3 {
    private String title;
    private String author;
    private double price;

    public Day20_Task3(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Book details responsibility
    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }

    // Formatting responsibility
    public String getFormattedTitle() {
        return "Title: " + title.toUpperCase();
    }

    // Pricing responsibility
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * (1 - discountPercentage);
    }

    public static void main(String[] args) {
        Day20_Task3 book = new Day20_Task3("Java Programming", "John Doe", 50.0);
        String formattedTitle = book.getFormattedTitle();
        double discountedPrice = book.calculateDiscountedPrice(0.1);

        System.out.println(formattedTitle);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
