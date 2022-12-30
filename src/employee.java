import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class employee {

	@Id
	private int id;
	private String name;
	private String city;
	@OneToOne 		//Unidireactional
	private emp salary;
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

	public employee(int id, String name, String city, emp salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public emp getSalary() {
		return salary;
	}

	public void setSalary(emp salary) {
		this.salary = salary;
	}

	
}
