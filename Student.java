class Student:
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<Integer>();

	//TODO constructor
	public Student(String index, String firstName, String lastName, int labPoints){
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastNae;
		this.labPoints.add(labPoints)
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
		sum=0;
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
