public class Book {
  
    private String title;
    private String author;
    private String publisher;
    private String copy_rightdate;

    public Book(String title, String author, String publisher, String copy_rightdate){

      this.title = title;
      this.author = author;
      this.publisher = publisher;
      this.copy_rightdate = copy_rightdate;
    }

    public String getTitle(){ // Getter Block for the title
      return title;
    }
    public String getAuthor(){ // Getter Block for the author
      return author;
    }
    public String getPublisher(){ // Getter Block for the publisher
      return publisher;
    }
    public String getCopy_RightDate(){ // Getter Block for copyright date
      return copy_rightdate;
    }
    

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

    public String toString(){
      return "Title: " + title + "\n" + "Author: " + author + "\n" + "Publisher: " + publisher + "\n" + "Copyright Date: " + copy_rightdate;
    }
}



