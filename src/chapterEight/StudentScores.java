package chapterEight;

import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int students = input.nextInt();

        System.out.println("Enter number of subjects: ");
        int subjects = input.nextInt();

        int[][] grade = new int[students][subjects];
        int[][] total = new int[students][1];
        int[][] average = new int[students][1];

        int sum;


        for (int i = 0; i < students; i++){
            sum = 0;
            System.out.println("Enter Student number: ");
            grade [i][i] = input.nextInt();
            for (int j = 0 ; j < subjects; j++){
                System.out.println("Enter grade: ");
                grade[i][j] = input.nextInt();
                sum = sum + grade[i][j];
                total[i][0] = sum;
                average[i][0] = sum/subjects;
            }
        }
        System.out.print("S/N       ");
        for (int i = 1; i <= subjects; i++)
        System.out.print("Course " + i + "\t" );
        System.out.print("  Total  Average");
        System.out.println(" ");
        for (int i = 0; i < students; i++){
            System.out.print("Student" + i + "\t");
            for (int j = 0; j < subjects; j++){
                System.out.print(grade[i][j] + "\t\t\t");
            }
            for (int j = 0; j < 1; j++){
                System.out.print(total[i][j] + "\t\t");
            }
            for (int j = 0; j < 1; j++){
                System.out.print(average[i][j] + "\t\t\t");
            }

            System.out.println();
        }









    }
}
