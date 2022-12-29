import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TEST {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("pasenger.cfg.xml");
		
		System.out.println("Start");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			
			pasenger obj=new pasenger();
			obj.setId(2711);
			obj.setName("Manish");
			obj.setCity1("Rajkot");
			obj.setCity2("London");
			obj.setSeatnum("A27");
			obj.setFclass("First");
			obj.setAirline("Emirates");
			
			s.save(obj);
		
			
			
			
			t.commit();
			s.close();
			sf.close();
			System.out.println("End");
			
			
			
	}

}
