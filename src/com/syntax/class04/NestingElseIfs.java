package com.syntax.class04;

public class NestingElseIfs {
	public static void main (String[] args) {
		//checking if the student completed the quiz
		//if so, I want to check their score
		//if score is more than 90 --- great job
		//if score is more than 80 --- well done
		//if score is more than 70 -- you could have done better
		//
		//if student didn't complete the quiz -- not good, please do homework on time
		
		boolean quizCompleted=true;
		int score=80;
		
		if(quizCompleted) {
			System.out.println("Let's check your score");
			if(score>90) {
				System.out.println("Great job, you study a lot");
			}else if (score>80) {
				System.out.println("Well done");
				
			}
			else if (score>70)
			{ System.out.println("You could have done better");
				
			}
			else {
				System.out.println("You failed");
				
			}
			
			
		}
		else {
			System.out.println("Please do HW on time");
			
		}
		
	}

}
