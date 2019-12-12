package ru.mirea.lab1book;

public class Book {
    private String author;
    private String title;
    private int year;
    public Book(String author, String title, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public  String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return ("Author : " + this.author +"\nTitle : " + title + "\nYear : " + this.year);
    }
}
