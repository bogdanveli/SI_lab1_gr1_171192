class Course {
    String index;
    String firstName;
    String lastName;
    List<Student> lista=new ArrayList<Student>();

    public Course(String index, String firstName, String lastName, List<Student> lista) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lista = lista;
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

    public void addStudent(Student newStudent) {
	    lista.add(newStudent);
	}       
  }