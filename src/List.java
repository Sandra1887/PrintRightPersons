import java.util.*;

public class List {
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

        System.out.println("Yngre än 20:");
        Methods.youngerThan20(pList);

        System.out.println("\n20 år och yngre än 30:");
        Methods.y20youngerthan30(pList);

        System.out.println("\nYngre än 20 och äldre än 29:");
        Methods.younger20older29(pList);

            System.out.println();
            Methods.youngest(pList);
            Methods.oldest(pList);

        System.out.println("\nLista över personer med jämn ålder:");
        Methods.evenAge(pList);

        System.out.println("\nSkriv ut alla men stoppa vid 40:");
        Methods.stop40(pList);

        System.out.println("\nFödda på skottår: ");
        Methods.printLeap(pList);
    }
}