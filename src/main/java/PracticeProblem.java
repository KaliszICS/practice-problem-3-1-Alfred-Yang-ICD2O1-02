/**
 * File: If statements
 * Author: Alfred Yang
 * Date Created: Mar 27, 2026
 * Date Last Modified: Mar 27, 2026
 */
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
	}

		public static String evenOrOdd(int num){
			String result = "";
			if (num % 2 == 0){
				result = "Even";
			}
			else{
				result = "Odd";
			}
			return result;
		}

		public static String teacherOrStudent(String duh){
			String ka = "";
			if (duh == "Kalisz"){
				ka = "Teacher";
			}
			else{
				ka = "Student";
			}
			return ka;}

		public static int fartherFromZero(int buh){
			int cuh = 0;
			if (buh > 0){
				cuh = buh + 5;
			}
			else if(buh < 0){
				cuh = buh -5;
			}
			return cuh;



		}

	}


