package project;
import java.util.ArrayList;


import java.util.Scanner;

public class LibraryManagement {

	    private static ArrayList<Book> books = new ArrayList<Book>();
	    
	    
	    
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        while (true) {
	            System.out.println("Library Management System");
	            System.out.println("-------------------------");
	            System.out.println("1. Add a Book");
	            System.out.println("2. View all Books");
	            System.out.println("3. Search for a Book");
	            System.out.println("4. Exit");

	            int choice = sc.nextInt();

	            switch (choice) 
	            {
	                case 1:
	                    addBook();
	                    break;
	                case 2:
	                    viewBooks();
	                    break;
	                case 3:
	                    searchBook();
	                    break;
	                case 4:
	                    System.out.println("Exiting Library Management System...");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	    }

	    public static void addBook() 
	    {
	        System.out.println("Adding a new book...");
	        System.out.println("Enter the title of the book: ");
	        
	        String title = sc.next().trim().toLowerCase();
	        System.out.println("Enter the author of the book: ");
	        
	        String author=sc.next().trim();
	        Book newBook = new Book(title, author);
	        
	        books.add(newBook);
	        System.out.println("Book added successfully.");
	    }

	    public  static void viewBooks() 
	    {
	        if (books.size() == 0) 
	        {
	            System.out.println("No books found.");
	        } 
	        else 
	        {
	        	
	        	
	        	
	            System.out.println("List of all books:");
	            for (int i = 0; i < books.size(); i++) 
	           {
	                System.out.println((i+1) + ". " + books.get(i).getTitle()
	                		+ " by " + books.get(i).getAuthor());
	           }
	        }
	    }

	    public  static void searchBook() 
	    {
	        System.out.println("Search for a book by title or author:");
	        String searchQuery = sc.next();
	        ArrayList<Book> results = new ArrayList<Book>();
	        
	        for (Book book : books) 
	        {
	            if (book.getTitle().contains(searchQuery) || book.getAuthor().
	            		contains(searchQuery)) {
	                results.add(book);
	         }
	      }
	        if (results.size() == 0) 
	        {
	            System.out.println("No books found.");
	        } else 
	        {
	            System.out.println("Search results:");
	            for (int i = 0; i < results.size(); i++) 
	            {
	                System.out.println((i+1) + ". " + results.get(i).getTitle()
	                		+ " by " + results.get(i).getAuthor());
	            }
	        }
	    }

	}

	class Book {

	    private String title;
	    private String author;

	    public Book(String title, String author) 
	    {
	        this.title = title;
	        this.author = author;
	    }

	    public String getTitle() 
	    {
	        return title;
	    }

	    public String getAuthor() 
	    {
	        return author;
	    }

	}


