package com.Sandhya.QuizAppService;

import java.util.*;

import com.Sandhya.Questions.Question;

public class ResultCaluculation {
	public static int Result(Question q, int res) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 10000;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Do you want to skip the question? Y / N");
			String skip=sc.next();
			if(skip.equalsIgnoreCase("Y")) {
				return 0;
			}
			else {
				//System.out.println("ss");
				break;
			}
		}
		int status=0;
		System.out.println("Please enter your answer");
		String ans=sc.next();
		while(System.currentTimeMillis()<endTime) {
			if(ans.equalsIgnoreCase(q.getAnswer())) {
				status=1;
			}
			else {
				status=2;
			}
		}
		if(status==1) {
			res=res+2;
			System.out.println("========================================================");
			System.out.println("Correct answer. Your current score is "+res);
			System.out.println("========================================================");
		}
		if(status==0) {
			System.out.println("========================================================");
			System.out.println("Time Out. Your current score is "+res);
			System.out.println("========================================================");
		}
		else if (status==2) {
			res=res-1;
			System.out.println("========================================================");
			System.out.println("Wrong answer. Your current Score is "+res);
			System.out.println("========================================================");
		}
		System.out.println("Next question");
		return res;
	}
}
