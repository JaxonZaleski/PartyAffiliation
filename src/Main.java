import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        String partyAffiliation = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your party affiliation: [D, R, I, Other]");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equals("D")) {
            System.out.println("you get a Donkey");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get an Elephant");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get a person");
        } else if (partyAffiliation.equals("Other")) {
            System.out.println("You get something else");
        } else {
            System.out.println("You entered the wrong value: " + partyAffiliation + ", did you mean Other");
        }
    }
}