import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studmain {

	public static void main(String[] args) {
		System.out.println("Process Started");
		Configuration con=new Configuration();
		con.configure("student.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
	/*	student obj=new student();
		obj.setRoll(1);
		obj.setName("Shubham");
		obj.setCity("Rajkot");
		
		stud st=new stud();
		st.setSid(1);
		st.setHobbies("Music");
		st.setId(obj);	

		stud st1=new stud();
		st1.setSid(121);
		st1.setHobbies("Drum");
		st1.setId(obj);
		
		stud st2=new stud();
		st2.setSid(1212);
		st2.setHobbies("Acting");
		st2.setId(obj);
		
		List<stud> li=new ArrayList<>();
		li.add(st);
		li.add(st1);
		li.add(st2);
		
		obj.setHobbies(li);

		s.save(obj);
		s.save(st);
		s.save(st1);
		s.save(st2);
		*/
		
		student st=(student)s.get(student.class, 1);
		System.out.println(st.getName()+" "+st.getCity()+" "+st.getRoll());
		
		for(stud stf : st.getHobbies())
		{
			System.out.println(stf.getHobbies());
		}
		
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("End");

	}

}
