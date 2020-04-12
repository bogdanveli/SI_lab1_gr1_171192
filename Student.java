class Student {
	String index;
	String firstName;
	String lastName;

	List<Integer> labPoints=new ArrayList<Integer>();

 public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverage() {
        int vkupno=0;
        for(int i=0;i<this.labPoints.size();i++){
            vkupno=vkupno+this.labPoints.get(i); }
        return vkupno/this.labPoints.size();
    }
    public boolean hasSignature() {
        if(labPoints.size()>8){
            return true;
        }
        else{
            return false;
        }
    }
}