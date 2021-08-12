package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a KCSE grade: ");
        int KCSE_grade = input.nextInt();
        System.out.print("Enter interview score: ");
        int interview_score  = input.nextInt();
        System.out.print("Enter confidence level: ");
        int confidence_level = input.nextInt();

          if (KCSE_grade >=65 && (interview_score >=6 || confidence_level>5))
                  System.out.print(" PASSED " );
          else if(KCSE_grade >=65 && (interview_score<6 || confidence_level<5))
              System.out.print(" fail ");
          if (KCSE_grade<65)
              System.out.print("fail");



    }


    }