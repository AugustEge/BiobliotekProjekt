import java.util.Objects;

public class Book {
    final String author;
    final String title;
    final String isbn;
    final int id;


    Book(String author, String title, String ISBNNumber, int bookNr) {
        this.author = author;
        this.title = title;
        this.isbn = ISBNNumber;
        this.id = bookNr;
//            this.borrowedDate = null;

    }
//        public boolean isAvailable() {
//            return borrowedBy == null;
//        }


    public String toString() {
//            String status = isAvailable() ? "på hylden" : borrowedBy+"; afleveringsfrist: " + getDueDate();

        return "Bognummer: " + id
                + ", Forfatter: " + author
                + ", Titel: " + title
                + ", ISBN: " + isbn;
//                    + " - " + status
    }

//        public boolean loanBook(Member member) {
//            if (this.isAvailable()) {
//                this.borrowedBy = member;
//                this.borrowedDate = LocalDate.now();
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public void returnBook() {
//            this.borrowedBy = null;
//            this.borrowedDate = null;
//        }
//        public LocalDate getDueDate() {
//            if (this.borrowedDate == null) {
//                return null;
//            }
//            return this.borrowedDate.plusDays(14);
//        }



    @Override
    public boolean equals (Object otherObj){
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        Book books = (Book) otherObj;
        return Objects.equals(author, books.author)
                && Objects.equals(title, books.title)
                && Objects.equals(isbn, books.isbn)
                && Objects.equals(id, books.id);
    }
}

