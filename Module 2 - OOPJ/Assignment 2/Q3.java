/*
3.  Book Inventory Management System 
 
You are required to write a Java program to implement a Book class that can be 
used to manage a book inventory system.  
The Book class should have the following fields: 
a.  title: A string field to store the title of the book. 
b.  author: A string field to store the name of the author of the book. 
c.  publisher: A string field to store the name of the publisher of the book. 
d.  isbn: A string field to store the ISBN number of the book. 
e.  year: An integer field to store the year in which the book was published. 
f.  price: A double field to store the price of the book. 
g.  quantity: An integer field to store the quantity of the book in the inventory. 
The Book class should have following methods   
a.  Constructors,  
b.  Getter & setter methods 
c.  Business Logic  methods 
I.  increaseQuantity(int quantity ): A method to increase the quantity of 
the book in the inventory by the specified amount. 
II.  decreaseQuantity(int quantity): A method to decrease the quantity of 
the book in the inventory by the specified amount. 
III.  getInventoryValue(): A method to calculate the total value of the 
inventory of the book, which is the product of the price and the 
quantity of the book                                                       */

import java.util.Scanner;

class Book{
      private static Scanner sc = new Scanner(System.in);


    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private double quantity;

    public Book(){

    this.title="";
    this.author="";
    this.publisher="";
    this.isbn="";
    this.year=0;
    this.price=0.0d;
    this.quantity=0.0d;

    }

    public void setTitle(String title){
        this.title=title;

    }
    public void setAuthor(String author){
        this.author=author;

    }
    public void setPublisher(String publisher){
        this.publisher=publisher;

    }
    public void setIsbn(String isbn){
        this.isbn=isbn;

    }
    public void setYear(int year){
        this.year=year;

    }
    public void setPrice(double price){
        this.price=price;

    }
    public void setQuantity(double quantity){
        this.quantity=quantity;

    }

    public void increaseQuantity(int quantity) {
        this.quantity=this.quantity+quantity;

    }

    public void decreaseQuantity(int quantity) {
        this.quantity=this.quantity-quantity;

    }

    public double getInventoryValue(){
        return this.price*this.quantity;
    }

    public static int menuList(){
    
    System.out.println("1. Increase quantity of book");
    System.out.println("2. Decrease quantity of book");
    System.out.println("3. Do not want to increase or decrease quantity of book");
    System.out.println("Enter choice ");
    return sc.nextInt();
    }

    }

class Q3{
    public static void main(String args[]){
    
    Book bookish=new Book();

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter details of new book to be added in the inventory: ");
    System.out.println("Enter title of the book");
    bookish.setTitle(sc.nextLine());

    System.out.println("Enter author of the book");
    bookish.setAuthor(sc.nextLine());

    System.out.println("Enter publisher of the book");
    bookish.setPublisher(sc.nextLine());

    System.out.println("Enter ISBN of the book");
    bookish.setIsbn(sc.nextLine());

    System.out.println("Enter year the book was published");
    bookish.setYear(sc.nextInt());

    System.out.println("Enter price of the book");
    bookish.setPrice(sc.nextDouble());

    System.out.println("Enter quantity of the book in the inventory");
    bookish.setQuantity(sc.nextDouble());

    int choice=bookish.menuList();
   // while (choice = bookish.menuList() != 3){

        switch(choice){
        case 1: System.out.println("Enter amount to increase quantity");
                bookish.increaseQuantity(sc.nextInt());
                break;
        
        case 2: System.out.println("Enter amount to decrease quantity");
                bookish.decreaseQuantity(sc.nextInt());
                break;
        }

    //}

    System.out.println("Inventory value = "+ bookish.getInventoryValue());

    }
}
