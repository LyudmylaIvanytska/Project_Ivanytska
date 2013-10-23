package ua.com.ivanytska;

public class Student implements Comparable <Student>{
	private String lastName;
	private String firstName;
	private String course;
	private String age;
	
	/**
	 * sorting old students first
	 */
	public int compareTo (Student s) {
		/*System.out.println("comparing: "+(Integer.parseInt(getAge()))+" and "+(Integer.parseInt(s.getAge())) );
		//sort
		if(Integer.parseInt(getAge()) >= 30 && Integer.parseInt(s.getAge())<30 ) {
			return -1;
		}
		if(Integer.parseInt(s.getAge()) >= 30 && Integer.parseInt(getAge())<30 ) {
			return 1;
		}*/
		return lastName.compareTo(s.getLastName());
	}
	
	public Student (String l, String f, String c, String a) {
		lastName=l;
		firstName=f;
		course = c;
		age = a;
	}
	
	public String getLastName () {
		return lastName;
		}
	public String getFirstName () {
		return firstName;
		}
	public String getCourse () {
		return course;
		}
	public String getAge () {
		return age;
		}
	public String getStudent() {
	    return lastName + " " + firstName + ", course " + course + ", age " + age;
	  }

	  @Override
	  public String toString() {
	    return getStudent();
}
}