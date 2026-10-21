
import java.util.ArrayList;

public class ConsoleUI {

    private Library library;

    public ConsoleUI(Library library) {
        this.library = library;
    }

    public void run() {
        boolean running = true;

        while (running) {
            showMenu();
            int choice = Integer.parseInt(IO.readln("Indtast valg: "));

            switch (choice) {
                case 1 -> borrowResource();
                case 2 -> returnResource();
                case 3 -> showLoans();
                case 0 -> running = false;
                default -> IO.println("Ugyldigt valg. Prøv igen");
            }
        }
    }

    private void showMenu() {
        IO.println();
        IO.println("1. Lån materiale");
        IO.println("2. Aflever materiale");
        IO.println("3. Vis alle lån");
        IO.println("0. Afslut");
        IO.println();
    }

    private void borrowResource() {
        int memberId = Integer.parseInt(
                IO.readln("Indtast medlemsnummer: "));

        String identifier = IO.readln("Indtast ISBN/EAN: ");

        LoanResult result = library.loanResource(identifier, memberId);

        switch (result) {
            case SUCCESS ->
                    IO.println("Lån registreret");

            case RESOURCE_NOT_FOUND ->
                    IO.println("Materialet eksisterer ikke");

            case MEMBER_NOT_FOUND ->
                    IO.println("Låner eksisterer ikke");

            case ALREADY_BORROWED ->
                    IO.println("Materialet er allerede udlånt");
        }
    }
    private void returnResource() {
        String identifier = IO.readln("Indtast ISBN/EAN: ");

        boolean success = library.returnResource(identifier);

        if (library.getResource(identifier) == null) {
            IO.println("Materialet eksisterer ikke");
        }
        else if (success) {
            IO.println("Materialet er afleveret");
        }
        else {
            IO.println("Materialet er ikke udlånt");
        }
    }

    private void showLoans() {
        int memberId = Integer.parseInt(
                IO.readln("Indtast medlemsnummer: "));

        if (library.getMember(memberId) == null) {
            IO.println("Låner eksisterer ikke");
            return;
        }

        ArrayList<Loan> loans = library.findLoansByMemberId(memberId);

        if (loans.isEmpty()) {
            IO.println("Låneren har ingen aktive lån");
            return;
        }

        for (Loan loan : loans) {
            IO.println(loan);
        }
    }
}
