import java.util.*;

public class Main {
    public static void main(String[] arg) {

        var pList = new Person[10];
        pList[0] = new Person("Elena Gilbert", 17);
        pList[1] = new Person("Stefan Salvatore", 162);
        pList[2] = new Person("Damon Salvatore", 177);
        pList[3] = new Person("Caroline Forbes", 17);
        pList[4] = new Person("Bonnie Bennett", 17);
        pList[5] = new Person("Tyler Lockwood", 22);
        pList[6] = new Person("Matt Donovan", 19);
        pList[7] = new Person("Alaric Saltzman", 41);
        pList[8] = new Person("Klas Mikaelson", 1000);
        pList[9] = new Person("Rebekah Mikaelson", 1012);

        Arrays.sort(pList);

        System.out.println("Younger than 20:");
        Methods.youngerThan20(pList);

        System.out.println("\n20 years and younger than 30:");
        Methods.y20youngerthan30(pList);

        System.out.println("\nYounger than 20 years and older than 29:");
        Methods.younger20older29(pList);

            System.out.println("\nYoungest:");
            Methods.youngest(pList);            //or --> System.out.println("Youngest: " + pList[0].name + " " + pList[0].age);
            System.out.println("\nOldest:");
            Methods.oldest(pList);              // or --> System.out.println("Oldest: " + pList[9].name + " " + pList[9].age);

        System.out.println("\nList of persons with even numbers of age:");
        Methods.evenAge(pList);

        System.out.println("\nList of everyone up to less than 40 years of age:");
        Methods.stop40(pList);

        System.out.println("\nBorn in a leap year:");
        Methods.printLeap(pList);
    }
}