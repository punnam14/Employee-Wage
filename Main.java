package com.employee.wage;
import static com.employee.wage.Service.*;

public class Main {
    public static void main(String [] args){
        System.out.println("Welcome to the employee wage computation program");
        Service.present();
        Service.dailyWage();
        Service.hourCheck();
    }
}
