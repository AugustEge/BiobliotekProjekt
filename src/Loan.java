import java.time.LocalDate;

public class Loan {
    final Resource resource;
    final Member member;
    final LocalDate borrowedDate;

    Loan(Resource resource, Member member, LocalDate borrowedDate) {
        this.resource = resource;
        this.member = member;
        this.borrowedDate = borrowedDate;
    }

    public Resource getResource() {
        return resource;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getDueDate() {
        return borrowedDate.plusDays(14);
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(getDueDate());
    }

    @Override
    public String toString() {
        return resource + "\n" + member
                + "\nafleveringsfrist " + getDueDate();
    }
}