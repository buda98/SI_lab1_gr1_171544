class Student:{
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;

	//TODO constructor
	public Student(String index, String firstName, String lastName){
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastNae;
		this.labPoints = new ArrayList<Integer>();
	}
	//TODO seters & getters
	public void setIndex(String newIndex){
		this.index=newIndex;
	}
	public void setFirstName(String newFirstName){
		this.firstName=newFirstName;
	}
	public void setLastName(String newLastName){
		this.lastName=newLastName;
	}
	public void setLabPoints(int position, int newLabPoints){
		this.labPoints.set(position, newLabPoints)
	}
	public String getIndex(){
		return this.index;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public List<Integer> getLabPoints(){
		return this.labPoints;
	}
	public double getAverage() {
		//TODO
		double sum=0;
		for(int i=0;i<this.labPoints.size();i++){
			sum+=labPoints.get(i);
		}
		return sum/labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		return (this.labPoints.size>8) ? true : false;
	}
}

class Course:{
        List<Student> students;

        public Course(){
                this.students = new ArrayList<Student>();
        }

        public void addStudent(String index, String firstName, String LastName){
                Student newStudent = Student(index, firstName, lastName);
                this.students.add(newStudent);
        }
	
	public void removeStudent(int positio){
		this.students.remove(position);
	}
	public double avaragePoints(){
		double sum=0;
		for(int i=0;i<this.students.size();i++){
                        sum+=this.students.get(i).getAverage();
                }
		return sum/this.students.size();
	}
	public int numSignatures(){
		int sum=0;
		for(int i=0;i<this.students.size();i++){
			if(this.students.get(i).hasSignature()){
				sum++;
			}
		}
		return sum;
	}
}
