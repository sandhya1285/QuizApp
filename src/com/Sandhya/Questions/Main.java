package com.Sandhya.Questions;

import java.util.Scanner;

import com.Sandhya.QuizAppService.QuizService;

public class Main {
    public static void main(String[] args) {

        // create a quiz (5 question)
        // create 5 questions from user
        // QuestionService : create, get, delete,
        // Array - String


        // Roles
        // Negative marking
        // realtime score
        // play again (different question)
        // skip question
        // set timer
    	QuizService service=new QuizService();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Hello !! Welcome to the quiz application. Please select the options based on your role\n"+
//                              "1. Trainer\n"+
//                              "2. Player\n"
//                           );
//        String role=sc.next();
//        if(role.equalsIgnoreCase("Trainer")) {
//        	System.out.println("Please enter your name and password to access the Quiz App");
//        	String name = sc.next();
//        	String password = sc.next();
//        	if(name.equals("Sandhya")) {
            service.trainerMethod();
        	//}
        	
        //}
        


    }
}