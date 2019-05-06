public class UseBook {

    public static void main(String[] args){
        Fiction book1 = new Fiction("Harry Potter And The Half Blood Prince");
        Fiction book2 = new Fiction("James And The Giant Peach");
        Fiction book3 = new Fiction("Five People You Meet In Heaven");
        Fiction book4 = new Fiction("Hunger Games Catching Fire");
        Fiction book5 = new Fiction("Maze Runner");
        NonFiction book6 = new NonFiction("Tuesdays With Morrie");
        NonFiction book7 = new NonFiction("In Cold Blood");
        NonFiction book8 = new NonFiction("The Right Stuff");
        NonFiction book9 = new NonFiction("Into Thin Air");
        NonFiction book10 = new NonFiction("The Prince");


        Book[] books = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};

        for(int i = 0; i < books.length; ++i){
            System.out.println(books[i].getTitle() + ", $" + books[i].getPrice());
        }
    }
}
