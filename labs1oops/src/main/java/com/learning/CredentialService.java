package com.learning;

import java.util.Random;

public class CredentialService {

    private static final String COMPANY_NAME = "abc";
    private static final String CAPITAL_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String SPECIAL_CHARACTERS = "!@#$";
    private static final String NUMBERS = "1234567890";
    private static final String COMBINED_CHARS = CAPITAL_CASE_LETTERS + LOWER_CASE_LETTERS + SPECIAL_CHARACTERS + NUMBERS;
    private static final int PASSWORD_LENGTH = 6;
    Random random = new Random();



    private Employee employee;

    public CredentialService(Employee employee) {
        this.employee = employee;
    }

    private String generatePassword() {
        char[] password = new char[PASSWORD_LENGTH];
        password[0] = LOWER_CASE_LETTERS.charAt(random.nextInt(LOWER_CASE_LETTERS.length()));
        password[1] = CAPITAL_CASE_LETTERS.charAt(random.nextInt(CAPITAL_CASE_LETTERS.length()));
        password[2] = SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));
        password[3] = NUMBERS.charAt(random.nextInt(NUMBERS.length()));
        for(int i = 4; i< PASSWORD_LENGTH ; i++) {
            password[i] = COMBINED_CHARS.charAt(random.nextInt(COMBINED_CHARS.length()));
        }
        return String.valueOf(password);
    }

    private String generateEmail(String departmentName) {
        StringBuilder sb = new StringBuilder();
        String email = sb.append(employee.getFirstName())
                .append(employee.getLastName())
                .append("@")
                .append(departmentName)
                .append(".")
                .append(COMPANY_NAME)
                .append(".com")
                .toString();
        return email.toLowerCase();
    }

    public void showCredential(String departmentName) {
        String emailId = generateEmail(departmentName);
        String password = generatePassword();
        System.out.println(emailId);
        System.out.println(password);
    }

}
