import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpprojectMain {

	public static void main(String[] args) {
		System.out.println("Process Start");
		Configuration con=new Configuration();
		con.configure("EmpProject.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		EmpProject obj=new EmpProject();
		obj.setId(1);
		obj.setName("Ritham");
		
		EmpProject obj1=new EmpProject();
		obj1.setId(2);
		obj1.setName("Aakash");
		
		Project p=new Project();
		p.setPid(121);
		p.setPname("Database Managment System");
		
		Project p1=new Project();
		p1.setPid(412);
		p1.setPname("Web Application");
		
		List<EmpProject> emp=new ArrayList<EmpProject>();
		
		List<Project> proj=new ArrayList<>();
		
		emp.add(obj);
		emp.add(obj1);
		
		proj.add(p);
		proj.add(p1);
		
		obj.setPname(proj);
		p.setEmpid(emp);
		
		s.save(obj);
		s.save(obj1);
		s.save(p);
		s.save(p1);
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("ENd");

	}

}
