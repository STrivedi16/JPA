import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class stud 
{
		@Id
		private int sid;
		
		private String hobbies;
		
		@ManyToOne
		private student id;

		public student getId() {
			return id;
		}

		public void setId(student id) {
			this.id = id;
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getHobbies() {
			return hobbies;
		}

		public void setHobbies(String hobbies) {
			this.hobbies = hobbies;
		}
		
		
	
}
