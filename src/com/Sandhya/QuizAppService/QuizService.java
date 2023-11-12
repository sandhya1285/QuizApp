package com.Sandhya.QuizAppService;
import java.util.*;

import com.Sandhya.Questions.DisplayQuestions;
import com.Sandhya.Questions.Question;
import com.Sandhya.Questions.QuestionPrep;

public class QuizService{
	public void playerMethod() {
	  while(true) {
		System.out.println("Please select the level of questions on which you want to play the quiz\n"+
		                    "1.Easy\n"+
				            "2.Medium\n"+
		                    "3.Hard\n");
		Scanner sc=new Scanner(System.in);
		int level=sc.nextInt();
		if(level==1) {
			DisplayQuestions.Easy_Questions(1);
		}
		else if(level==2) {
			DisplayQuestions.Medium_Questions(1);
		}
		else {
			DisplayQuestions.Hard_Questions(1);
		}
		System.out.println("Do you want to play again? Y / N");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("N")) {
			break;
		}
	  }
	}
	
	 public void trainerMethod() {
		QuestionPrep prep=new QuestionPrep();
		List<Question> list;
		while(true) {
		System.out.println("Please select the level of questions on which you want to perform the operations\n"+
		                    "1.Easy\n"+
				            "2.Medium\n"+
		                    "3.Hard\n");
		Scanner sc=new Scanner(System.in);
		int level = sc.nextInt();
		System.out.println("Please select the type of operations you want to perform\n"+
				           "1. Create\n"+
				           "2. Get\n"+
				           "3. Delete\n"+
				           "4. Display\n");
		int operation = sc.nextInt();
		if(operation==1) {
			if(level==1) {
				System.out.println("Please enter the easy question");
				sc.nextLine();
				String quest=sc.nextLine();
				System.out.println("Enter the first option");
				String opt1=sc.nextLine();
				System.out.println("Enter the second option");
				String opt2=sc.nextLine();
				System.out.println("Enter the third option");
				String opt3=sc.nextLine();
				System.out.println("Enter the fourth option");
				String opt4=sc.nextLine();
				System.out.println("Enter the answer");
				String ans=sc.next();
				Question q=new Question(prep.getEasySize()+1,quest,"a) " +opt1, "b) "+opt2, "c) "+opt3, "d) "+opt4, ans);
				prep.addEasy(q);
				System.out.println("Easy question is created.");
			}
			else if(level==2){
				System.out.println("Please enter the medium question");
				sc.nextLine();
				String quest=sc.nextLine();
				System.out.println("Enter the first option");
				String opt1=sc.nextLine();;
				System.out.println("Enter the second option");
				String opt2=sc.nextLine();;
				System.out.println("Enter the third option");
				String opt3=sc.nextLine();
				System.out.println("Enter the fourth option");
				String opt4=sc.nextLine();;
				System.out.println("Enter the answer");
				String ans=sc.next();
				Question q=new Question(prep.getMediumSize()+1,quest,"a) " +opt1, "b) "+opt2, "c) "+opt3, "d) "+opt4, ans);
				prep.addMedium(q);
				System.out.println("Medium question is created.");
			}
			else {
				System.out.println("Please enter the question");
				sc.nextLine();
				String quest=sc.nextLine();
				System.out.println("Enter the first option");
				String opt1=sc.nextLine();
				System.out.println("Enter the second option");
				String opt2=sc.nextLine();
				System.out.println("Enter the third option");
				String opt3=sc.nextLine();
				System.out.println("Enter the fourth option");
				String opt4=sc.nextLine();
				System.out.println("Enter the answer");
				String ans=sc.next();
				Question q=new Question(prep.getHardSize()+1,quest,"a) " +opt1, "b) "+opt2, "c) "+opt3, "d) "+opt4, ans);
				prep.addHard(q);
				System.out.println("Hard question is created.");
			}
		}
		else if(operation==2) {
			System.out.println("Enter the Id of the question which you wanted to retrieve.");
			int id =sc.nextInt();
			if(level==1) {
				Question q=prep.getEasy(id);
				if(q==null) {
					System.out.println("Please select the id in the range of 1 to "+ prep.getEasySize());
				}
				else {
					System.out.println(q);
				}
			}
			else if(level==2){
					Question q=prep.getMedium(id);
					if(q==null) {
						System.out.println("Please select the id in the range of 1 to "+ prep.getMediumSize());
					}
					else {
						System.out.println(q);
					}
			}
			else {
				Question q=prep.getHard(id);
				if(q==null) {
					System.out.println("Please select the id in the range of 1 to "+ prep.getHardSize());
				}
				else {
					System.out.println(q);
				}
			}
		}
		else if(operation==3) {
			System.out.println("Enter the Id of the question which you wanted to delete");
			int id =sc.nextInt();
			if(level==1) {
				String q=prep.deleteEasy(id);
				System.out.println(q);
			}
			else if(level==2){
					String q=prep.deleteMedium(id);
					System.out.println(q);
			}
			else {
				String q=prep.deleteHard(id);
				System.out.println(q);
			}
		}
		else {
			if(level==1) {
				DisplayQuestions.Easy_Questions(0);
			}
			else if(level==2) {
				DisplayQuestions.Medium_Questions(0);
			}
			else {
				DisplayQuestions.Hard_Questions(0);
			}
		}
		System.out.println("Do you want to continue the operations? Y or N");
		String input=sc.next();
		if(input.equals("N")) {
			System.out.println("Thank you for optmizing the quiz app.");
			break;
		}
		
	 }
	
}
}


