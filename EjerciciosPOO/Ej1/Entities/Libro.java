package EjerciciosPOO.Ej1.Entities;




public class Libro {
    
    private int isbn;
    private String title;
    private String author;
    private int pages;


    //Empty Constructor
    public Libro() {
    
    }

    //Constructor
    public Libro(int isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    //Getters
    public int getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    //Setters
    public void setISBN(int isbn){
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    //toString()
    public String toString() {
        return ("Título: " + title + ".\nAutor: " + author + ".\nCantidad de páginas: " + pages + ".\nISBN: " + isbn); 
    }


}
