package Exception.Student_Grade_Parser;

public class Marks {
	public void check(String[] marks,int n){
		for(int i=0;i<n;i++) {
			try {
				System.out.println("The grade "+(i+1)+" is "+Integer.parseInt(marks[i]));
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid grade input: "+marks[i]+".");
			}
		}
	}
}
