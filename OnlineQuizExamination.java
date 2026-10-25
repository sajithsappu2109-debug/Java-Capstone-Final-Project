
import java.util.Scanner;

public class OnlineQuizExamination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName;
        int score = 0;
        char answer;

        System.out.println("==================================");
        System.out.println("    ONLINE QUIZ EXAMINATION");
        System.out.println("==================================");

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.println("\nWelcome, " + studentName + "!");
        System.out.println("Answer the following questions.");
        System.out.println("==================================");

        // Question 1
        System.out.println("\n1. Which language is used for Java programming?");
        System.out.println("A. HTML");
        System.out.println("B. Java");
        System.out.println("C. CSS");
        System.out.println("D. SQL");
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if (answer == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which keyword is used to create a class in Java?");
        System.out.println("A. define");
        System.out.println("B. function");
        System.out.println("C. class");
        System.out.println("D. create");
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if (answer == 'C') {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which method is the entry point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. execute()");
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if (answer == 'C') {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which data type stores true or false?");
        System.out.println("A. int");
        System.out.println("B. boolean");
        System.out.println("C. char");
        System.out.println("D. double");
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if (answer == 'B') {
            score++;
        }

        // Question 5
        System.out.println("\n5. Which symbol ends a Java statement?");
        System.out.println("A. .");
        System.out.println("B. ,");
        System.out.println("C. :");
        System.out.println("D. ;");
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = Character.toUpperCase(sc.next().charAt(0));

        if (answer == 'D') {
            score++;
        }

        // Display Result
        double percentage = (score / 5.0) * 100;

        System.out.println("\n==================================");
        System.out.println("          QUIZ RESULT");
        System.out.println("==================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Total Marks  : 5");
        System.out.println("Correct      : " + score);
        System.out.println("Wrong        : " + (5 - score));
        System.out.printf("Percentage   : %.2f%%\n", percentage);

        if (percentage >= 50) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        System.out.println("==================================");
        System.out.println("Thank you for attending the quiz!");

        sc.close();
    }
}
