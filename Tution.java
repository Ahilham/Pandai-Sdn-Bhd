import java.text.DecimalFormat;
import java.util.ArrayList;

class Tuition {
	 private String Nameofcentre;
	 private address Address;
	 private headmaster Headmaster;
	 private ArrayList<Tutor> tutors= new ArrayList<Tutor>();
	 private static final DecimalFormat df = new DecimalFormat("0.00");

	 public void setNameofcentre(String Nameofcentre) {
		 this.Nameofcentre = Nameofcentre;
	 }
	 
	 public String getNameofcentre() {
		 return Nameofcentre;
	 }
	 
	 public void setAddress(address Address) {
		 this.Address = Address;
	 }
	 
	 public address getAddress() {
		 return Address;
	 }
	 
	 public void setheadmaster(headmaster Headmaster) {
		 this.Headmaster=Headmaster;
	 }
	 
	 public headmaster getheadmaster() {
		 return Headmaster;
	 }

	public ArrayList<Tutor> getTutors() {
		return tutors;
	}
	
	public void AddTutor(Tutor tutor) {
		this.tutors.add(tutor);
	}
	
	public void RemoveTutor(Tutor tutor) {
		this.tutors.remove(tutor);
	} 
	
	public int getnumberoftutor() {
		return this.tutors.size();
	}
	
	public void displaytutors() {
		for(int i=0;i<this.tutors.size();i++) {
			System.out.println("Tutor-"+(i+1)+": "+this.tutors.get(i).getname().getlName());
		}
	}
	
	public void displayaveragemarksforcenter() {
		double average=0;
		for(int i=0;i<this.tutors.size();i++) {
			average+=this.tutors.get(i).getaverageMarkofStudents();
		}
		
		System.out.println("Average marks of students in this center: "+df.format(average));
	}
	 
}
