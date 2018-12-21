package student;

import java.util.*;
import java.lang.Comparable;

public class Student implements Comparable<Student>{
	private int ID;
	private String name;
	private String sex;
	private int age;
	
	public Student(int ID, String name, String sex, int age)//构造函数
	{
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void setID(int ID) {this.ID = ID;}//setter
	public void setName(String Iname) {this.name = name;}
	public void setSex(String sex) {this.sex = sex;}
	public void setAge(int age) {this.age = age;}
	
	public int getID() {return ID;}//getter
	public String getName() {return name;}
	public String getSex() {return sex;}
	public int getAge() {return age;}	
	
	public String toString() {return("学号："+ID+" 姓名"+name+" 性别："+sex+" 年龄"+age);}
	public int compareTo(Student student) {//compareTo接口
		   //  return name.compareTo(student.name);
		     return ID - student.getID();
		 }  
}
