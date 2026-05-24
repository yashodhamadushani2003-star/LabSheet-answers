/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question01;



public class Book {
    // 1. Private Attributes
    private String title;
    private String author;
    private int pages;

    // 2. Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 3. Getter Methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // 4. getBookType Method
    public String getBookType() {
        if (this.pages < 100) {
            return "Short Book";
        } else {
            return "Regular Book";
        }
    }
}
