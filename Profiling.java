package profiling;

import java.util.Scanner;

public class Profiling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int profilesCount = 0;
        String[] names = new String[100];
        String[] email = new String[100];
        String[] password = new String[100];
        int[] age = new int[100];
        int deductor = 100;
        int ctr = 100;

        boolean profiling = true;
        cont:
        while (profiling) {
            System.out.println("__________________________________________");
            System.out.println("What to do?");
            System.out.println("1. Create Profile");
            System.out.println("2. Search Profile");
            System.out.println("3. Show all Profiles");
            System.out.println("");

            int select = sc.nextInt();

            if (select==1) {

                System.out.println("There are still " + ctr + " null profiles remaining.");

                if (ctr == 0) {
                    System.out.println("Sorry");
                    continue;
                }
                if (deductor == 0) {
                    System.out.println("Ooops profiles limit reached ");
                    continue;
                }

                sc.nextLine();
                System.out.println("__________________________________________");
                System.out.println("Fill Up");
                System.out.println("Please Remember your ID No. below \n");
                System.out.println("ID No:" + profilesCount);
                System.out.print("Enter Name: ");
                names[names.length - deductor] = sc.nextLine();
                System.out.print("Enter Email: ");
                email[names.length - deductor] = sc.nextLine();
                System.out.print("Enter Password: ");
                password[names.length - deductor] = sc.nextLine();
                System.out.print("Enter Age: ");
                age[names.length - deductor] = sc.nextInt();
                sc.nextLine();
                profilesCount++;
                deductor--;
                ctr--;
            } 
//Search Profile
            else if (select==2) {
                System.out.println("__________________________________________");
                System.out.println("Enter name that you wish to search:");
                sc.nextLine();
                String k = sc.nextLine();
                for (int j = 0; j < names.length; j++) {
                    if (k.equals(names[j])) {
                        System.out.println("Name:" + names[j]);
                        System.out.println("Password:" + password[j]);
                        System.out.println("Age:" + age[j]);
                        System.out.println("Email:" + email[j]);

                        continue cont;
                    }
                }
                System.out.println("Profile Not Found!");
                continue cont;

            } 
//Show all profiles       
            else if (select==3) {

                for (int j = 0; j < names.length - deductor; j++) {
                    System.out.println("__________________________________________");
                    System.out.println("Profile No. " + j + "\n");

                    System.out.println("Name: " + names[j]);
                    System.out.println("Email: " + email[j]);
                    System.out.println("Password: " + password[j]);
                    System.out.println("Age: " + age[j]);
                    System.out.println("\n");
                }

            } else {
                System.out.println("Invalid Input");
                continue cont;
            }
        }
    }
}
