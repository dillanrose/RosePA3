package com.company;

import java.util.Scanner;
import java.security.SecureRandom;
public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom dice = new SecureRandom();
        int solution = 1;
        while (solution == 1) {
            int correctAnswers = -1;
            int incorrectAnswers=0;
            System.out.println("Welcome student, please enter a difficulty level 1-4");
            int difficulityLevel = scnr.nextInt();
            System.out.println("Please enter practice type,");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplacation");
            System.out.println("4. Division");
            System.out.println("5. All of the above");
            int problemTypes = scnr.nextInt();

            switch (problemTypes){
                case 1:
                    switch (difficulityLevel) {

                        case 1:
                            System.out.println("Difficulty 1");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(9);
                                int var2 = dice.nextInt(9);
                                System.out.println("How much is " + var1 + " plus " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 + var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        case 2:
                            System.out.println("Difficulty 2");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(99);
                                int var2 = dice.nextInt(99);
                                System.out.println("How much is " + var1 + " plus " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 + var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep Trying");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        case 3:
                            System.out.println("Difficulty 3");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(999);
                                int var2 = dice.nextInt(999);
                                System.out.println("How much is " + var1 + " plus " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 + var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;

                        case 4:
                            System.out.println("Difficulty 4");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(9999);
                                int var2 = dice.nextInt(9999);
                                System.out.println("How much is " + var1 + " plus " + var2 + "?");
                                double  answer = scnr.nextInt();
                                if (answer == var1 + var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep Trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        default:
                            System.out.println("Please enter a correct Difficulty");
                            break;
                    }
            break;
                case 2:

            switch (difficulityLevel) {

                case 1:
                    System.out.println("Difficulty 1");
                    for (int counter = 1; counter <= 10; counter++) {
                        int var1 = dice.nextInt(9);
                        int var2 = dice.nextInt(9);
                        System.out.println("How much is " + var1 + " minus " + var2 + "?");
                        double answer = scnr.nextInt();
                        if (answer == var1 - var2) {
                            int correctResponse = dice.nextInt(4);
                            switch (correctResponse) {
                                case 0:
                                    System.out.println("Very Good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                            correctAnswers = correctAnswers + 1;
                        } else {
                            int incorrectResponse = dice.nextInt(4);
                            switch (incorrectResponse) {
                                case 0:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep trying.");
                                    break;
                            }
                            incorrectAnswers = incorrectAnswers + 1;


                        }
                    }
                    break;
                case 2:
                    System.out.println("Difficulty 2");
                    for (int counter = 1; counter <= 10; counter++) {
                        int var1 = dice.nextInt(99);
                        int var2 = dice.nextInt(99);
                        System.out.println("How much is " + var1 + " minus " + var2 + "?");
                        double answer = scnr.nextInt();
                        if (answer == var1 - var2) {
                            int correctResponse = dice.nextInt(4);
                            switch (correctResponse) {
                                case 0:
                                    System.out.println("Very Good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                            correctAnswers = correctAnswers + 1;
                        } else {
                            int incorrectResponse = dice.nextInt(4);
                            switch (incorrectResponse) {
                                case 0:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep Trying");
                                    break;
                            }
                            incorrectAnswers = incorrectAnswers + 1;


                        }
                    }
                    break;
                case 3:
                    System.out.println("Difficulty 3");
                    for (int counter = 1; counter <= 10; counter++) {
                        int var1 = dice.nextInt(999);
                        int var2 = dice.nextInt(999);
                        System.out.println("How much is " + var1 + " minus " + var2 + "?");
                        double answer = scnr.nextInt();
                        if (answer == var1 - var2) {
                            int correctResponse = dice.nextInt(4);
                            switch (correctResponse) {
                                case 0:
                                    System.out.println("Very Good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                            correctAnswers = correctAnswers + 1;
                        } else {
                            int incorrectResponse = dice.nextInt(4);
                            switch (incorrectResponse) {
                                case 0:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep trying.");
                                    break;
                            }
                            incorrectAnswers = incorrectAnswers + 1;


                        }
                    }
                    break;

                case 4:
                    System.out.println("Difficulty 4");
                    for (int counter = 1; counter <= 10; counter++) {
                        int var1 = dice.nextInt(9999);
                        int var2 = dice.nextInt(9999);
                        System.out.println("How much is " + var1 + " minus " + var2 + "?");
                        double answer = scnr.nextInt();
                        if (answer == var1 - var2) {
                            int correctResponse = dice.nextInt(4);
                            switch (correctResponse) {
                                case 0:
                                    System.out.println("Very Good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                            correctAnswers = correctAnswers + 1;
                        } else {
                            int incorrectResponse = dice.nextInt(4);
                            switch (incorrectResponse) {
                                case 0:
                                    System.out.println("No. Please try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep Trying.");
                                    break;
                            }
                            incorrectAnswers = incorrectAnswers + 1;


                        }
                    }
                    break;
                default:
                    System.out.println("Please enter a correct Difficulty");
                    break;
            }
            break;

                case 3:
                    switch (difficulityLevel) {

                        case 1:
                            System.out.println("Difficulty 1");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(9);
                                int var2 = dice.nextInt(9);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        case 2:
                            System.out.println("Difficulty 2");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(99);
                                int var2 = dice.nextInt(99);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer=scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep Trying");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        case 3:
                            System.out.println("Difficulty 3");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(999);
                                int var2 = dice.nextInt(999);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;

                        case 4:
                            System.out.println("Difficulty 4");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(9999);
                                int var2 = dice.nextInt(9999);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep Trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        default:
                            System.out.println("Please enter a correct Difficulty");
                            break;
                    }
                        break;

                        case 4:
                            switch (difficulityLevel) {

                                case 1:
                                    System.out.println("Difficulty 1");
                                    for (int counter = 1; counter <= 10; counter++) {
                                        int var1 = dice.nextInt(9);
                                        int var2 = dice.nextInt(9);
                                        System.out.println("How much is " + var1 + " divided by " + var2 + "?");
                                        double answer = scnr.nextInt();
                                        if (answer == var1 / var2) {
                                            int correctResponse = dice.nextInt(4);
                                            switch (correctResponse) {
                                                case 0:
                                                    System.out.println("Very Good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice Work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            correctAnswers = correctAnswers + 1;
                                        } else {
                                            int incorrectResponse = dice.nextInt(4);
                                            switch (incorrectResponse) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don't give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            incorrectAnswers = incorrectAnswers + 1;


                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Difficulty 2");
                                    for (int counter = 1; counter <= 10; counter++) {
                                        int var1 = dice.nextInt(99);
                                        int var2 = dice.nextInt(99);
                                        System.out.println("How much is " + var1 + " divided by " + var2 + "?");
                                        double answer = scnr.nextInt();
                                        if (answer == var1 / var2) {
                                            int correctResponse = dice.nextInt(4);
                                            switch (correctResponse) {
                                                case 0:
                                                    System.out.println("Very Good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice Work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            correctAnswers = correctAnswers + 1;
                                        } else {
                                            int incorrectResponse = dice.nextInt(4);
                                            switch (incorrectResponse) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don't give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep Trying");
                                                    break;
                                            }
                                            incorrectAnswers = incorrectAnswers + 1;


                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Difficulty 3");
                                    for (int counter = 1; counter <= 10; counter++) {
                                        int var1 = dice.nextInt(999);
                                        int var2 = dice.nextInt(999);
                                        System.out.println("How much is " + var1 + " divided by " + var2 + "?");
                                        double answer = scnr.nextInt();
                                        if (answer == var1 / var2) {
                                            int correctResponse = dice.nextInt(4);
                                            switch (correctResponse) {
                                                case 0:
                                                    System.out.println("Very Good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice Work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            correctAnswers = correctAnswers + 1;
                                        } else {
                                            int incorrectResponse = dice.nextInt(4);
                                            switch (incorrectResponse) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don't give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep trying.");
                                                    break;
                                            }
                                            incorrectAnswers = incorrectAnswers + 1;


                                        }
                                    }
                                    break;

                                case 4:
                                    System.out.println("Difficulty 4");
                                    for (int counter = 1; counter <= 10; counter++) {
                                        int var1 = dice.nextInt(9999);
                                        int var2 = dice.nextInt(9999);
                                        System.out.println("How much is " + var1 + " divided by " + var2 + "?");
                                        double answer = scnr.nextInt();
                                        if (answer == var1 / var2) {
                                            int correctResponse = dice.nextInt(4);
                                            switch (correctResponse) {
                                                case 0:
                                                    System.out.println("Very Good!");
                                                    break;
                                                case 1:
                                                    System.out.println("Excellent!");
                                                    break;
                                                case 2:
                                                    System.out.println("Nice Work!");
                                                    break;
                                                case 3:
                                                    System.out.println("Keep up the good work!");
                                                    break;
                                            }
                                            correctAnswers = correctAnswers + 1;
                                        } else {
                                            int incorrectResponse = dice.nextInt(4);
                                            switch (incorrectResponse) {
                                                case 0:
                                                    System.out.println("No. Please try again.");
                                                    break;
                                                case 1:
                                                    System.out.println("Wrong. Try once more.");
                                                    break;
                                                case 2:
                                                    System.out.println("Don't give up!");
                                                    break;
                                                case 3:
                                                    System.out.println("No. Keep Trying.");
                                                    break;
                                            }
                                            incorrectAnswers = incorrectAnswers + 1;


                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Please enter a correct Difficulty");
                                    break;
                            }
                            break;



















                case 5:
                    //random operations
                    switch (difficulityLevel) {

                        case 1:
                            System.out.println("Difficulty 1");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(9);
                                int var2 = dice.nextInt(9);
                                System.out.println("How much is " + var1 + " + " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    System.out.println("Correct answer = " +answer+ ".");
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        case 2:
                            System.out.println("Difficulty 2");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(99);
                                int var2 = dice.nextInt(99);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    System.out.println("Correct answer = " +answer+ ".");
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep Trying");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        case 3:
                            System.out.println("Difficulty 3");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(999);
                                int var2 = dice.nextInt(999);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    System.out.println("Correct answer = " +answer+ ".");
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;

                        case 4:
                            System.out.println("Difficulty 4");
                            for (int counter = 1; counter <= 10; counter++) {
                                int var1 = dice.nextInt(9999);
                                int var2 = dice.nextInt(9999);
                                System.out.println("How much is " + var1 + " times " + var2 + "?");
                                double answer = scnr.nextInt();
                                if (answer == var1 * var2) {
                                    int correctResponse = dice.nextInt(4);
                                    switch (correctResponse) {
                                        case 0:
                                            System.out.println("Very Good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                    correctAnswers = correctAnswers + 1;
                                } else {
                                    int incorrectResponse = dice.nextInt(4);
                                    System.out.println("Correct answer = " +answer+ ".");
                                    switch (incorrectResponse) {
                                        case 0:
                                            System.out.println("No. Please try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep Trying.");
                                            break;
                                    }
                                    incorrectAnswers = incorrectAnswers + 1;


                                }
                            }
                            break;
                        default:
                            System.out.println("Please enter a correct Difficulty");
                            break;
                    }
                    break;
                default:
                    System.out.println("Incorrect operation selected");
            }
                    System.out.println("");
                   if(correctAnswers == -1) {
                       System.out.print("Please try again.");
                   }
                   else{
                       correctAnswers=correctAnswers+1;

                           if (correctAnswers >= 8) {
                               System.out.print("You had " + correctAnswers + " correct answers");
                               incorrectAnswers= 10-correctAnswers;
                               System.out.println(" and " +incorrectAnswers+ " incorrect answers.");
                               System.out.println("Congratulations you are able to go to the next level!");
                           } else {
                               System.out.print("You had " + correctAnswers + " correct answers");
                               incorrectAnswers=10-correctAnswers;
                               System.out.println(" and " +incorrectAnswers+ " incorrect answers.");
                               System.out.println("Please ask the teacher for more help.");
                           }
                           }
                           System.out.println("");
                           System.out.println("Test Complete, please enter 1 for a new test or 2 to end testing application.");
                           solution = scnr.nextInt();
                       }
                   }
        }
