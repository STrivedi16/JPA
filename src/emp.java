import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class emp {

	@Id
	private int eid;
	
	private int salary;
	@OneToOne
	private employee id;
	
	public employee getId() {
		return id;
	}
	public void setId(employee id) {
		this.id = id;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int eid, int salary) {
		super();
		this.eid = eid;
		this.salary = salary;
	}
	
}
