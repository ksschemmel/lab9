
public class HonorsEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentUML myStudentUML = new StudentUML("Kailey",19,"Criminal Justice","Photography", 2.8, 4);
		StudentUML seanStudentUML = new StudentUML("Sean",19,"Exercise Science","Music", 3.1, 0);
	
				if(myStudentUML.GPA>=3.5) {
					System.out.println("Student is eligible for honors");
				}
				else
				{
					System.out.println("Student is not eligible for honors");
				
		
		}
			
	}

}
