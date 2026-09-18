public class Member {
    final String name;
    final int memberCode;


    Member(String name, int memberCode) {
        this.name = name;
        this.memberCode = memberCode;
    }

    public String toString() {

        return name
                + " (Medlemsnummer: " + memberCode
                + ") ";
    }


}
