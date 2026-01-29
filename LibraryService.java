public class LibraryService {
    public void borrowBook(int bookId, int memberId) {
        System.out.println("Book " + bookId + " borrowed by member " + memberId);
    }

    public void returnBook(int bookId) {
        System.out.println("Book " + bookId + " returned successfully");
    }

    public void searchBook(String title) {
        System.out.println("Searching for book: " + title);
    }

    public void addBook(Book book) {
        System.out.println("New book added: " + book.getTitle());
    }

    public void registerMember(Member member) {
        System.out.println("New member registered: " + member.getName());
    }
}
