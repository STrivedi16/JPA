import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class EmpProject {

	@Id
	private int id;
	private String name;
	
	@ManyToMany
	private List<Project> pname;

	public EmpProject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpProject(int id, String name, List<Project> pname) {
		super();
		this.id = id;
		this.name = name;
		this.pname = pname;
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

	public List<Project> getPname() {
		return pname;
	}

	public void setPname(List<Project> pname) {
		this.pname = pname;
	}
	
	
}
