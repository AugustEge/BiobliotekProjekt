import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    private ArrayList<Resource> resources = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();


    public void addResource(Resource resource) {
        resources.add(resource);
    }
    public void addMember(Member member) {
        members.add(member);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void printResources() {
        for (Resource resource : resources) {
            System.out.println(resource);
        }
    }
    public void printMembers() {
        for (Member member : members) {
            System.out.println(member);
        }

    }
    Resource getResource(String identifier) {
        for (Resource resource : resources) {
            if (resource.getIdentifier().equals(identifier)) {
                return resource;
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

    public LoanResult loanResource(String identifier, int memberId) {

        Resource resource = getResource(identifier);
        if (resource == null) {
            return LoanResult.RESOURCE_NOT_FOUND;
        }

        Member member = getMember(memberId);
        if (member == null) {
            return LoanResult.MEMBER_NOT_FOUND;
        }

        for (Loan loan : loans) {
            if (loan.getResource().equals(resource)) {
                return LoanResult.ALREADY_BORROWED;
            }
        }

        Loan loan = new Loan(resource, member, LocalDate.now());
        loans.add(loan);

        return LoanResult.SUCCESS;
    }
    public boolean returnResource(String identifier) {

        for (Loan loan : loans) {
            if (loan.getResource().getIdentifier().equals(identifier)) {
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


