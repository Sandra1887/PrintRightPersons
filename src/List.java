import java.util.*;
import javax.swing.*;

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
        for (int i = 0; i < pList.length; i++) {
            if (pList[i].age < 20)//alla under 20 år
                System.out.println(pList[i].name + "\t" + pList[i].age);
            }
        System.out.println("\n20 år och yngre än 30:");
        for (int i = 0; i<pList.length; i++) {
            if (pList[i].age == 20 || pList[i].age < 30)//alla som är 20 och alla yngre än 30
                System.out.println(pList[i].name + "\t" + pList[i].age);
        }
        System.out.println("\nYngre än 20 och äldre än 29:");
            for (int i = 0; i<pList.length; i++) {
            if (pList[i].age < 20 || pList[i].age > 29)
                System.out.println(pList[i].name + "\t" + pList[i].age);
        }

        int youngest = pList[0].age;
        String youngName = pList[0].name;
        for (int i = 0; i < pList.length; i++) {
            if (pList[i].age < youngest) { // om i är mindre än youngest
                youngest = pList[i].age;
                youngName = pList[i].name;// youngest = i;
            }
        }
        System.out.println("\nYngst: " + youngName + " " + youngest);

        int oldest = pList[0].age;
        String oldName = pList[0].name; //äldst på plats nr 0
        for (int i = 0; i < pList.length; i++) {
            if (pList[i].age > oldest) { // om age > oldest
                oldest = pList[i].age;
                oldName = pList[i].name;//oldest = age;
            }
        }
        System.out.println("Äldst: " + oldName + " " + oldest);

        System.out.println("\nLista över personer med jämn ålder:");
        for (int i = 0; i<pList.length; i++) {
            if (pList[i].age % 2 == 0) {
                System.out.println(pList[i].name + " " + pList[i].age);
            }
        }
        System.out.println("\nSkriv ut alla men stoppa vid 40:");
        for (int i = 0; i<pList.length; i++) {
            if (pList[i].age > 40) {
                break;
            }
            System.out.println(pList[i].name + " " + pList[i].age);
        }
    }
}