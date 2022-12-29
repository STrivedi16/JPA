import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class student 
{
		@Id
		private int roll;
		private String name;
		private String city;
		
		@OneToMany(mappedBy= "id")
		private List<stud> hobbies;

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
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

		public List<stud> getHobbies() {
			return hobbies;
		}

		public void setHobbies(List<stud> hobbies) {
			this.hobbies = hobbies;
		}

		public student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public student(int roll, String name, String city, List<stud> hobbies) {
			super();
			this.roll = roll;
			this.name = name;
			this.city = city;
			this.hobbies = hobbies;
		}
		
		
}
