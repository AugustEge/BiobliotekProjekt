import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printMembers() {
        for (Member member : members) {
            System.out.println(member);
        }

    }

    Book getBook(int bookId) {
        for (Book book : books) {
            if (book.id == bookId) {
                return book;
            }
        }
        return null;
    }


    Member getMember(int memberId) {
        for (Member member : members) {
            if (member.memberCode == memberId) {
                return member;
            }
        }
        return null;
    }

    boolean loanBook(int bookId, int memberId) {
        Book book = getBook(bookId);
        if (book == null) return false;

        Member member = getMember(memberId);
        if (member == null) return false;

        for (Loan loan : loans) {
            if (loan.getBook().equals(book)) {
                return false;
            }
        }

        Loan loan = new Loan(book, member, LocalDate.now());
        loans.add(loan);

        return true;
    }

    boolean returnBook(int bookId) {
        for (Loan loan : loans) {
            if (loan.getBook().id == bookId) {
                loans.remove(loan);
                return true;
            }
        }

        return false;
    }
    ArrayList<Loan> findLoansByMemberId(int memberId) {
        ArrayList<Loan> result = new ArrayList<>();

        for (Loan loan : loans) {
            if (loan.getMember().memberCode == memberId) {
                result.add(loan);
            }
        }

        return result;
    }
}


