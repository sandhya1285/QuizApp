
package com.Sandhya.Questions;

import java.util.List;

public class DisplayQuestions {
	//Displaying easy questions when selected create operation
	public static void Easy_Questions() {
		List<Question> easy=QuestionPrep.easy;
		for(Question q: easy) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();
			
		}
		
	}
	//Displaying medium questions when selected create operation
	public static void Medium_Questions() {
		List<Question> medium=QuestionPrep.medium;
		for(Question q: medium) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();	
			
		}
		
	}
	
	//Displaying hard questions when selected create operation
	public static void Hard_Questions() {
		List<Question> hard=QuestionPrep.hard;
		for(Question q: hard) {
			System.out.println(q.getId()+". "+q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			System.out.println();
		}	
		
	}
	
 
}
