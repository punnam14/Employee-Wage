package com.employee.wage;
import java.util.Random;

public class Service {


    static int absent = 0;
    static int present = 0;
    static int partTime = 0;

    public static void present() {
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 0) {
            System.out.println("\n Employee status is " + a + ": Absent");
        } else {
            System.out.println("\n Employee status is " + a + ": Present");
        }
    }

    public static void dailyWage() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(3);
            if (a == 0) {
                absent += 1;
            } else if (a == 1) {
                present += 1;
            } else {
                partTime += 1;
            }
        }
        int wage = (160 * present) + (80 * partTime);
        System.out.println("\n Number of days present is: " + present + ", parttime is: " + partTime + " ,absent is: " + absent);
        System.out.println("Total wage is: " + wage);
    }

    public static void hourCheck() {

        Random random = new Random();
        int restrictedWage = 0;
        int ftHours = 0;
        int ptHours = 0;

        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(3);
            if (a == 0) {
                absent += 1;
            } else if (a == 1) {
                present += 1;
                ftHours = present * 8;
            } else {
                partTime += 1;
                ptHours = partTime * 4;
            }
            int totalHours = ftHours + ptHours;
            if (totalHours < 100){
                restrictedWage = (present * 160) + (partTime * 80);
                System.out.println("full time: " +ftHours+ " part time: " +ptHours+ " gives: " +totalHours );
                System.out.println("Total wage for the month is: " +restrictedWage);
            }
        }
    }
}
