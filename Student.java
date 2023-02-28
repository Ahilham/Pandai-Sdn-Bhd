
public class Student {
	private name Name;
	private String ID;
	private int Yearentered;
	private address Address;
	private double Marks[];
	private int currsz=0;
	
	public void setName(name Name) {
		this.Name = Name;
	}
	
	public name getName() {
		return Name;
	}

	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}

	public int getYearentered() {
		return Yearentered;
	}

	public void setYearentered(int Yearentered) {
		this.Yearentered = Yearentered;
	}
	
	public address getAddress() {
		return Address;
	}

	public void setAddress(address address) {
		Address = address;
	}

	public void setMaxlistMark(int i) {
		Marks = new double[i];
	}

	public void addMarks(double Marks) throws Exception {
		if(currsz<this.Marks.length) {
			if(Marks>100||Marks<0) { 
				throw new Exception("Error in mark detected");
				// show error when keyed in outside mark range
			}
			else {
				
				this.Marks[currsz++]=Marks;
			}
			
		}
		else {
			System.out.println("Reached maximum amount of marks.");
			return;
		}
	}
	
	public void editMark(double Marks,int index) {
		this.Marks[index]=Marks;
	}
	
	public void displaymarks() {
		for(int i=0;i<currsz;i++) {
			System.out.println("Mark-"+(i+1)+": "+Marks[i]);
		}
	}
	
	public double gethighestMark() {
		double highest=this.Marks[0];int top=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(highest<this.Marks[i]) {
				top=i;
				highest=this.Marks[i];
			}
		}
		return this.Marks[top];
	}
	
	public int gethighestMarknumber() {	//get the highest Mark index number
		double highest=this.Marks[0];int top=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(highest<this.Marks[i]) {
				top=i;
				highest=this.Marks[i];
			}
		}
		return top+1;
	}
	
	public double getlowestMark() {
		double lowest=this.Marks[0];int bottom=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(lowest>this.Marks[i]) {
				bottom=i;
				lowest=this.Marks[i];
			}
		}
		return this.Marks[bottom];
	}
	
	public int getlowestMarknumber() {	//get the lowest Mark index number
		double lowest=this.Marks[0];int bottom=0;
		for(int i=0;i<this.Marks.length;i++) {
			if(lowest>this.Marks[i]) {
				bottom=i;
				lowest=this.Marks[i];
			}
		}
		return bottom+1;
	}
	
	public double getaverageMark() {
		double average;double sum=0;
		for(int i=0;i<this.Marks.length;i++) {
			sum+=this.Marks[i];
		}
		average = sum/this.Marks.length;
		return average;
	}

}
