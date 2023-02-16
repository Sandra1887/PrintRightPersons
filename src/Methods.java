public class Methods {

    static void youngerThan20(Person[] array) {
        for (int i=0; i<array.length; i++) {
            if (array[i].age < 20) {
                System.out.println(array[i].name + "\t" + array[i].age);
            }
        }
    }
    static void y20youngerthan30(Person[] array) {
        for (int i=0; i<array.length; i++) {
            if (array[i].age == 20 || array[i].age < 30)//alla som är 20 och alla yngre än 30
                System.out.println(array[i].name + "\t" + array[i].age);
        }
    }
    static void younger20older29(Person[] array) {
        for (int i=0; i<array.length; i++) {
            if (array[i].age < 20 || array[i].age > 29)
                System.out.println(array[i].name + "\t" + array[i].age);
        }
    }
    static void youngest(Person[] array) {
        int youngest = array[0].age;
        String youName = array[0].name;
        for (int i=0; i<array.length; i++) {
            if (array[i].age < youngest) {
                youngest = array[i].age;
                youName = array[i].name;
            }
        }
        System.out.println("Yngst: " + youName + " " + youngest);
    }
    static void oldest(Person[] array) {
        int oldest = 0;
        String oldName = array[0].name;
        for (int i=0; i<array.length; i++) {
            if (array[i].age > oldest) {
                oldest = array[i].age;
                oldName = array[i].name;
            }
        }
        System.out.println("Äldst: " + oldName + " " + oldest);
    }

    static void evenAge(Person[] array) {
        int even;
        String evenName;
        for (int i=0; i<array.length; i++) {
            if (array[i].age % 2 != 0) {
                continue;
            } else {
                even = array[i].age;
                evenName = array[i].name;
            }
            System.out.println(evenName + " " + even);
        }
    }

    static void stop40(Person[] array) {
        for (int i=0; i<array.length; i++) {
            if (array[i].age > 40) {
                break;
            }
            System.out.println(array[i].name + " " + array[i].age);
        }
    }

    static boolean leapYear(int age) {
        int y = 2023 - age;
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printLeap(Person[] array) {
        for (int i=0; i<array.length; i++) {
            if (leapYear(array[i].age)) {
                System.out.println(array[i].name);
            }
        }
    }
}