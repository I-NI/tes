package student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<GraduateStudent> stuList = new ArrayList<>();
		stuList.add(new GraduateStudent(2016210734,"谌悦章","男",20,"夏海轮","信息工程",99));
		stuList.add(new GraduateStudent(2013210734,"刘一","女",20,"王五","通信工程",88));
		stuList.add(new GraduateStudent(2016210733,"关二","男",20,"赵六","网络工程",77));
		stuList.add(new GraduateStudent(2016210735,"张三","其他",20,"魏七","计算机科学与技术",100));
		stuList.add(new GraduateStudent(2016210736,"李四","女",20,"姜八","英语",59));

		Collections.sort(stuList);

		java.util.Iterator<GraduateStudent> itr = stuList.iterator();
		double sum = 0,max = 0,min = 100;
		for(GraduateStudent i : stuList)
		{
			sum = sum + i.getScore();
			if(max < i.getScore()) {max = i.getScore();}
			if(min > i.getScore()) {min = i.getScore();}
		}
		double mean = sum / stuList.size();
		System.out.println(sum+" "+mean+" " + max + " "+min);		
		String statistic = "平均成绩"+ mean + "最大值" + max + "最小值" + min;
		try {
			FileWriter fw = new FileWriter("E:\\homework.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(GraduateStudent i:stuList)
			{
				bw.write(i.toString());
			}
			bw.write(statistic);
			bw.flush();
			bw.close();
			fw.close();
		}catch(Exception el){
			el.printStackTrace();
		}
	}
}