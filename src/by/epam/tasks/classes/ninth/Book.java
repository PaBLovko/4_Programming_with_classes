package by.epam.tasks.classes.ninth;

public class Book {
    private static int startId = 1;
    private int id;
    private String title;
    private String authors;
    private String publishingHouse;
    private Integer yearOfPublication;
    private int numberOfPages;
    private float price;
    private String typeOfCover;

    public Book(String title, String authors, String publishingHouse,
                Integer yearOfPublication, int numberOfPages, float price, String typeOfCover) {
        this.id = startId++;
        this.title = title;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfCover = typeOfCover;
    }

    public static int getStartId() {
        return startId;
    }

    public static void setStartId(int startId) {
        Book.startId = startId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", typeOfCover='" + typeOfCover + '\'' +
                '}';
    }
}
