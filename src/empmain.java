import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class empmain {

	public static void main(String[] args) {
		System.out.println("Process start");
	Configuration con=new Configuration();
	con.configure("employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		employee obj=new employee();
		obj.setId(2);
		obj.setName("Akshay");
		obj.setCity("Pune");
		
		emp em=new emp();
		em.setEid(2);
		em.setSalary(41000);
		em.setId(obj);
		obj.setSalary(em);
		
		s.save(em);
		s.save(obj);
		t.commit();
		s.close();
		sf.close();
		System.out.println("ENd");
		

	}

}
