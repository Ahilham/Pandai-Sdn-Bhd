
public class Main {

	public static void main(String[] args) {
		listofcentre Sarawak = new listofcentre(); //the state or area that the centers are in
		Tuition Hello = new Tuition();	//the center
		Hello.setNameofcentre("Hello");	
		Sarawak.getTuition().add(0, Hello); //add center to the state or area that it is in
		
		Tutor Ali = new Tutor();
		name Name0 = new name();
		Name0.setfName("Ali");
		Name0.setlName("Abdullah");
		Ali.setName(Name0);
		
		
		
		Student Ilham = new Student(); //student in a center
		name Name1 = new name();
		Name1.setfName("Ahmad");
		Ilham.setName(Name1);
		try {
			Ilham.setMaxlistMark(3);
			Ilham.addMarks(30);
			Ilham.addMarks(30);
			Ilham.addMarks(40);
			}catch (Exception ex) {//catch block.. action be taken in case of Exception
	    		System.out.println("Error cannot continue");
	    		ex.printStackTrace();
	    		
	    	}
		
		Student Nur = new Student();
		name Name2 = new name();
		Name2.setfName("Nur");
		Nur.setName(Name2);
		try {
			Nur.setMaxlistMark(3);
			Nur.addMarks(60.50);
			Nur.addMarks(20);
			Nur.addMarks(30.25);
		}catch (Exception ex) {
			System.out.println("Error cannot continue");
    		ex.printStackTrace();
		}
		
		
		
		Ali.AddStudent(Ilham);
		Ali.AddStudent(Nur);
		Hello.AddTutor(Ali);
		
		
		
		System.out.println("Name of center: "+Sarawak.getTuition().get(0).getNameofcentre()); // display name of tuition center
		System.out.println("Number of tutor: "+Hello.getnumberoftutor());
		Hello.displaytutors();
		Hello.displayaveragemarksforcenter();
		System.out.println("\nTutor: "+Ali.getname().getfName()+" "+Ali.getname().getlName());
		System.out.println("Number of students: "+Ali.getnumberofstudents()+"\n");
		Ali.displaystudents();
		Ali.displayaverageMarkofStudents();
		
		
		

	}
}