import java.util.ArrayList;

class Tuition {
	 private String Nameofcentre;
	 private address Address;
	 private headmaster Headmaster;
	 private ArrayList<Tutor> tutors= new ArrayList<Tutor>();
	 private ArrayList<Student> students= new ArrayList<Student>();

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

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void AddTutor(Tutor tutor) {
		this.tutors.add(tutor);
	}
	
	public void RemoveTutor(Tutor tutor) {
		this.tutors.remove(tutor);
	}
	
	public void AddStudent(Student student) {
		this.students.add(student);
	}
	
	public void RemoveStudent(Student student) {
		this.students.remove(student);
	}
	 
	 
	 
}
