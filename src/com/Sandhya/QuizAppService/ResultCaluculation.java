package com.Sandhya.QuizAppService;

import java.util.*;
import com.Sandhya.Questions.Question;

public class ResultCaluculation {
	static String ans = "";
	static String skip = "";
	private static boolean userInputReceived;
	public static int Result(Question q, int res) {
		userInputReceived = false;
	    Scanner scanner = new Scanner(System.in);
	    int status=0;
//	    int timerSeconds = 10;
//	    System.out.println("Timer");
//	    Timer timer = new Timer();
//	    System.out.println("scheduling timer");
//        timer.schedule(new InputTimerTask(), timerSeconds * 1000);
	    Reminder reminder=new Reminder();
        System.out.println("checking the condition");
        while (!userInputReceived && reminder.timeup==0) {
        	    System.out.println("Inside while loop");
            	System.out.println("Enter the inputs");
            	System.out.println ("Do you want to skip the question? Y /N");
            	if(scanner.hasNext()) {
            	skip=scanner.next();
            	if(skip.equalsIgnoreCase("Y")) {
//            		timer.cancel();
            		reminder.new RemindTask().getTimer().cancel();
            		return 0;
            	}
            	System.out.println("Please enter your answer");
            	ans = scanner.next();
                userInputReceived = true;
            	}
            	System.out.println("end of while loop");
        }
        System.out.println("Cancelling the timer");
        reminder.new RemindTask().getTimer().cancel();
        if(ans.equalsIgnoreCase(q.getAnswer())) {
        	status=1;
        }
        else if(userInputReceived == true && !ans.equalsIgnoreCase(q.getAnswer())) {
        	status=2;
        }
        System.out.println("status "+status);
		if (status == 1) {
			res = res + 2;
			System.out.println("========================================================");
			System.out.println("Correct answer. Your current score is " + res);
			System.out.println("========================================================");
		} else if (status == 0) {
			System.out.println("========================================================");
			System.out.println("Time Out. Your current score is " + res);
			System.out.println("========================================================");
		} else {
			res = res - 1;
			System.out.println("========================================================");
			System.out.println("Wrong answer. Your current Score is " + res);
			System.out.println("========================================================");
		}
		System.out.println("Next question");
		return res;
	}

//     class InputTimerTask extends TimerTask {
//        public InputTimerTask() {
//        	System.out.println("Inside timer constructor");
//        }
//        @Override
//        public void run() {
//            System.out.println("\nTime's up! No input received.");
//        }
//    }
}
class Reminder {
    Timer timer;
    int timeup=0;
    public Reminder() {
        timer = new Timer();
        timer.schedule(new RemindTask(), 10000);
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timeup=1;
            timer.cancel(); //Terminate the timer thread
            System.out.println("timer cancelled");
            return;
        }
        public Timer getTimer() {
        	return timer;
        }
    }
}