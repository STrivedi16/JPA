import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pid;
	
	private String pname;
	
	@ManyToMany(mappedBy= "pname")
	private List<EmpProject> empid;

	public Project(int pid, String pname, List<EmpProject> empid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.empid = empid;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<EmpProject> getEmpid() {
		return empid;
	}

	public void setEmpid(List<EmpProject> empid) {
		this.empid = empid;
	}
	
	

}
