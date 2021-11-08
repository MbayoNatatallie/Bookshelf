public class Bookshelf { // Driver Class to execute book.java 
    public static void main(String[] args){ 

      // Create different book variables 
       Book book, book1, book2; 
        book = new Book ("Left To Tell", "Immaculee Ilibagiza", "Hay House Inc.", "2019-06-14");
        book1 = new Book ("The Dante Chamber", "Matthew Pearl", "Penguin Press", "2018-06-11");
        book2 = new Book ("The Yelllow Belle", "Natallie M'bayo", "Dante House", "2017-05-11");

        // Prints out all books in book variables in bookshelf
        System.out.println(book); 
        System.out.println(book1);
        System.out.println(book2);

    }
}
