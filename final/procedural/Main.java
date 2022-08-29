import java.io.File;
import java.util.*; // ArrayList, Scanner 

public class Main
{
    static Scanner tmp = new Scanner(System.in).useDelimiter(" ");
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> usrs = new ArrayList<Integer>();  // holds ids of the users 
    static ArrayList<String> books = new ArrayList<String>();      // holds all the books 
    static ArrayList<Integer> borrowed = new ArrayList<Integer>(); // indexes of borrowed books

    public static void list_books()
    {
        for (int i =0; i< books.size(); i++)
        {
            System.out.println("Book @ "+(i+1)+" is "+ books.get(i));
        }
    }

    public static int read_books()
    {
        try
        {
            File library = new File("/home/dev/Desktop/3_types/procedural/books.txt");
            Scanner fd  = new Scanner(library);
            while ( fd.hasNextLine())
            {
                String book = fd.nextLine();
                books.add(book);
            }
            fd.close();
            return 0;
        }
        catch (Exception e)
        {
            System.out.println("Database not Found!!!");
            return -1;
        }
    }

    public static void get_user()
    {
        
        System.out.println("Enter your id: ");
        if (input.hasNextInt())
        {
            int id = input.nextInt();
            if (usrs.contains(id)) // user did not return the book
            {
                System.out.println("Return perviously borrowed book.");
                System.out.println("Max book qouta reached.");
            }
            else    // user can borrow a book
            {
                System.out.print("Enter book name: ");
                String book = tmp.nextLine();
                borrowed.add(books.indexOf(book));
                usrs.add(id);
            }
        }
    }

    public static void add_book()
    {
        String book = "";
        System.out.print("Enter a bbook name: ");
        if (tmp.hasNextLine())
        {
            book = tmp.nextLine();
            if (books.contains(book))
            {
                System.out.println("Book already in database");
            }
            else
            {
                books.add(book);
            }
        }

    }

    public static boolean is_admin()
    {
        String admin = "";
        String passwd = "";

        System.out.print("Enter admin username: ");
        if (tmp.hasNextLine())
        {
            admin = tmp.nextLine();
        }
        System.out.print("Enter admin passowrd: ");
        if (tmp.hasNextLine())
        {
            passwd = tmp.nextLine();
        }
        if (admin.equals("admin") && passwd.equals("1234")) // this is a bad security practice 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void list_borrowed()
    {
        for (int i =0; i < borrowed.size(); i++)
        {   
            System.out.println(i+" "+books.get(borrowed.get(i)));
        }
    }
    public static int get_book_index(String book)
    {
        // loops over the element in borrowed until it finds the first occurce of the book index
        for ( int i=0; i < borrowed.size(); i++)
        {
            if (borrowed.get(i) == books.indexOf(book))
            {
                return i;
            }
        }
        // if not found return -1
        return -1;
    }

    public static void return_book()
    {
        if (borrowed.isEmpty())
        {
            System.out.println("No borrowed books");
            return;
        }
        int index =0;
        list_borrowed();
        // asks user for book name 
        String book = "";
        System.out.print("Enter a book name: ");
        if (tmp.hasNextLine())
        {
            book += tmp.nextLine();
            if ((index = get_book_index(book)) != -1 )
            {
                borrowed.remove(index);
            }
        }        
    }


    public static int menu()
    {
        int choice =0;
        while ( choice < 1 || choice > 6)
        {
            System.out.println("1. List all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Donate a book");
            System.out.println("4. List users");
            System.out.println("5. Return book");
            System.out.println("6. Exit");
            if (input.hasNextInt())
            {
                choice = input.nextInt();
                System.out.println("Choice: "+ choice);
            }
        }
        return choice;
    }


    public static void main(String[] args)
    {   
        read_books();
        while (true)
        { 
            if (books.isEmpty()) // if not books are in borrowed then clear the user list
                usrs.clear();
            
            switch(menu())
            {
                case 1:
                    list_books();
                    break;
                
                case 2:
                    get_user();
                    break;
                
                case 3:
                    add_book();
                    break;
                case 4:
                {
                    if(is_admin())
                    {
                        for (int i=0; i < usrs.size(); i++)
                            System.out.println(i+ " @ "+usrs.get(i));
                        
                    }
                    else
                        System.out.println("Wrong admin credentials");
                    break;
                }
                case 5:
                    return_book();
                    break;
                default: // exit the while loop and the main function 
                {
                    tmp.close();
                    input.close();
                    return ;
                }
            }
        } 
    }
}


/*
 menu 

    1. list all books 
    2. enter user id to borrow a book 
    3. add book to list
    4. list users
    5. return book 
    6. exit 

*/