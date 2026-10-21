
public class Book extends Resource {
    final int id;
    private int pages;

    Book(String author, String title, String ISBNNumber,
         int bookNr, int pages) {

        super(ISBNNumber, title, author);
        this.id = bookNr;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Bognummer: " + id
                + ", Forfatter: " + getCreator()
                + ", Titel: " + getTitle()
                + ", ISBN: " + getIdentifier()
                + ", Antal sider: " + pages;
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




}

