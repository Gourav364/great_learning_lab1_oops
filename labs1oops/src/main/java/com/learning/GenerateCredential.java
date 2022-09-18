package com.learning;

import java.util.Scanner;

public class GenerateCredential {

    public static void main(String[] args) {
        Employee emp = new Employee("Gourav", "Sharma");
        CredentialService credentialService = new CredentialService(emp);

        System.out.println("Please select department");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc = new Scanner(System.in);
        int department =  sc.nextInt();

        String departmentName = "";
        switch (department) {
            case 1: departmentName = "tech";
            break;
            case 2: departmentName = "admin";
            break;
            case 3: departmentName = "hr";
            break;
            case 4: departmentName = "legal";
            break;
            default:
                departmentName = "";
                break;
        }

        credentialService.showCredential(departmentName);

    }
}
