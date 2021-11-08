public class Book {
  // Instance data are declared private and can be accessed using setter and getter
    private String title;
    private String author;
    private String publisher;
    private String copy_rightdate;

    // Constructor that accept the parameter title, author, publisher, copy_rightdate
    public Book(String title, String author, String publisher, String copy_rightdate){ 

      this.title = title;
      this.author = author;
      this.publisher = publisher;
      this.copy_rightdate = copy_rightdate;
    }

    // Getter methods returns the values title, author, publisher and copyright, to access the private variable of the book class.
    public String getTitle(){ 
      return title;
    }
    public String getAuthor(){ 
      return author;
    }
    public String getPublisher(){
      return publisher;
    }
    public String getCopy_RightDate(){ 
      return copy_rightdate;
    }
    

    // Setter methods are use to update the values in private variable of the book class. 
    public void setTitle(String title){

      this.title = title;
    }
    public void setAuthor(String author){

      this.author = author;
    }
    public void setPublisher(String publisher){

      this.publisher = publisher;
    }
    public void setCopy_RightDate(String copy_rightdate){

      this.copy_rightdate = copy_rightdate;
    }

    // The toString method is a block template that shows how the strings should be printed when executed

    public String toString(){
      return "Title: " + title + "\n" + "Author: " + author + "\n" + "Publisher: " + publisher + "\n" + "Copyright Date: " + copy_rightdate;
    }
}



