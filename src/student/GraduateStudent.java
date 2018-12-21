package student;

public class GraduateStudent extends Student{
	private String tutor;
	private String major;
	private double score;
	
	GraduateStudent(int ID, String name, String sex, int age, String tutor, String major, double score)
	{
		super(ID, name, sex, age);
		this.tutor = tutor;
		this.major = major;
		this.score = score;
	}
	public String getTutor() {return tutor;}
	public String getMajor() {return major;}
	public double getScore() {return score;}
	
	public String toString() {return super.toString()+" 导师："+this.tutor+" 专业:"+this.major+" 成绩:"+this.score+"\r"+"\n";}

}
