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
//Som låner vil jeg kunne søge efter materialer i bibliotekets katalog, så jeg kan finde det materiale, jeg ønsker at låne.
//
//Acceptkriterier:
//- Når jeg søger efter en eksisterende titel, skal systemet vise det tilhørende materiale.
//- Når jeg søger efter en titel, der ikke findes, skal systemet give besked om, at materialet ikke blev fundet.

// User story 2 – Låne et materiale
// Som låner vil jeg kunne låne et materiale,
// så jeg kan tage det med hjem og bruge det.
//
// Acceptkriterier:
// - Når jeg låner et ledigt materiale, skal systemet registrere lånet.
// - Når jeg forsøger at låne et allerede udlånt materiale,
//   skal systemet give besked om, at det ikke er tilgængeligt.


// User story 3 – Aflevere et materiale
// Som låner vil jeg kunne aflevere et materiale,
// så det bliver tilgængeligt for andre lånere.
//
// Acceptkriterier:
// - Når jeg afleverer et lånt materiale, skal lånet fjernes fra systemet.
// - Når materialet er afleveret, skal det kunne lånes igen.


// User story 4 – Registrere en ny låner
// Som bibliotekar vil jeg kunne registrere nye lånere,
// så de kan låne materialer på biblioteket.
//
// Acceptkriterier:
// - Når jeg registrerer en ny låner, skal personen tilføjes til medlemslisten.
// - Når en låner er registreret, skal personen kunne låne materialer.


// User story 5 – Se en låners lån
// Som bibliotekar vil jeg kunne se, hvilke materialer en låner har lånt,
// så jeg kan holde styr på lånerens udlån.
//
// Acceptkriterier:
// - Når jeg søger på en registreret låners ID,
//   skal systemet vise alle materialer, personen har lånt.
// - Hvis låneren ikke har nogen aktive lån,
//   skal systemet vise en tom liste.


// User story 6 – Se overskredne lån
// Som bibliotekar vil jeg kunne se, hvilke materialer der er
// afleveret for sent eller endnu ikke er afleveret,
// så jeg kan kontakte de relevante lånere.
//
    // Acceptkriterier:
// - Når et aktivt lån har overskredet afleveringsdatoen,
//   skal systemet kunne identificere det som forsinket.
// - Når jeg ser listen over overskredne lån,
//   skal systemet kun vise aktive lån med overskredet afleveringsdato.
}
