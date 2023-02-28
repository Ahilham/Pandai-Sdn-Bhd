
public class Main {

	public static void main(String[] args) {
		listofcentre Sarawak = new listofcentre(); //the state or area that the centers are in
		Tuition Hello = new Tuition();	//the center
		Hello.setNameofcentre("Hello");	
		Sarawak.getTuition().add(0, Hello); //add center to the state or area that it is in
		
		System.out.println(Sarawak.getTuition().get(0).getNameofcentre()); // display name of tuition center
		
		Student Ilham = new Student(); //student in a center
		name Name = new name();
		Name.setfName("Ahmad");
		Ilham.setName(Name);
		Hello.getStudents().add(0, Ilham); //add student to their respective center
		
		try {
		Ilham.setMaxlistMark(10);
		Ilham.addMarks(30);
		Ilham.addMarks(30);
		Ilham.addMarks(40);
		}catch (Exception ex) {//catch block.. action be taken in case of Exception
    		System.out.println("Error cannot continue");
    		ex.printStackTrace();
    		
    	}
		
		System.out.println("Highest mark-"+Ilham.gethighestMarknumber()+": "+Ilham.gethighestMark());
		

	}
}