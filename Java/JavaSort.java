package Java;


import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class JavaSort {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		
		studentList.sort(new StudentChecker<Student>());
		for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

class StudentChecker<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		double diff=((Student)o2).getCgpa()-((Student)o1).getCgpa();
		if(diff!=0)
			return diff<0?-1:1;
		diff=((Student)o1).getFname().compareTo(((Student)o2).getFname());
		if(diff!=0)
			return (int)diff;

		return ((Student)o1).getId()-((Student)o2).getId();
	}

}