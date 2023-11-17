
package com.Sandhya.Questions;

import java.util.List;
import java.util.Scanner;

import com.Sandhya.QuizAppService.ResultCaluculation;

public class DisplayQuestions {
	//Displaying easy questions when selected create operation
	static int res=0;
	public static void Easy_Questions(int n) {
		List<Question> easy=QuestionPrep.easy;
		for(Question q: easy) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();
			if(n==0) {
				continue;
			}
			if(n==1) {
				int returnedValue=ResultCaluculation.Result(q, DisplayQuestions.res);
				if(returnedValue==0) {
					  continue;
				}
				else {
					DisplayQuestions.res=returnedValue;
				}
			}
		}
		if(n==1)
		System.out.println("Your Total Score is "+DisplayQuestions.res +" out of "+easy.size()*2);
		
		
	}
	//Displaying medium questions when selected create operation
	public static void Medium_Questions(int n) {
		List<Question> medium=QuestionPrep.medium;
		Scanner sc=new Scanner(System.in);
		for(Question q: medium) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();
			if(n==0) {
				continue;
			}
			if(n==1) {
				int returnedValue=ResultCaluculation.Result(q, DisplayQuestions.res);
				if(returnedValue==0) {
					  continue;
				}
				else {
					DisplayQuestions.res=returnedValue;
				}
			}
		}
		if(n==1)
		System.out.println("Your Total Score is "+DisplayQuestions.res +" out of "+medium.size()*2);
		
	}
	
	//Displaying hard questions when selected create operation
	public static void Hard_Questions(int n) {
		List<Question> hard=QuestionPrep.hard;
		for(Question q: hard) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();
			if(n==0) {
				continue;
			}
			if(n==1) {
				int returnedValue=ResultCaluculation.Result(q, DisplayQuestions.res);
				if(returnedValue==0) {
					  continue;
				}
				else {
					DisplayQuestions.res=returnedValue;
				}
			}
		}
		if(n==1)
		System.out.println("Your Total Score is "+DisplayQuestions.res +" out of "+hard.size()*2);
		
		}	
		
}
	
