package hilell.l13;

import java.util.Scanner;

public class L13Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Type firstName: ");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Choose gender");
//
//        for (Gender value : Gender.values()) {
//            System.out.println(value);
//        }
//        String genderFromConsole = scanner.nextLine();
//
//        Gender gender = Gender.valueOf(genderFromConsole.toUpperCase());
//
//        System.out.println(new User(firstName, gender));
        Gender g = Gender.values()[0];


        if (g == Gender.MALE) {
            System.out.println("MALE");
        } else if (g == Gender.FEMALE) {
            System.out.println("FEMALE");
        }

        switch (g) {
            case MALE:
                System.out.println("MALE");
                break;
            case FEMALE:
                System.out.println("FEMALE");
                break;
        }

    }
}
