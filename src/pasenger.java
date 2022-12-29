import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class pasenger {
	
		@Id
		int id;
		@Column(name="name")
		String name;
		@Column(name="city")
		String city1;
		@Column(name="tocity")
		String city2;
		@Column(name="seatnum")
		String seatnum;
		@Column(name="fclass")
		String fclass;
		@Column(name="airline")
		String airline;
		public String getAirline() {
			return airline;
		}
		public void setAirline(String airline) {
			this.airline = airline;
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
		public String getCity1() {
			return city1;
		}
		public void setCity1(String city1) {
			this.city1 = city1;
		}
		public String getCity2() {
			return city2;
		}
		public void setCity2(String city2) {
			this.city2 = city2;
		}
		public String getSeatnum() {
			return seatnum;
		}
		public void setSeatnum(String seatnum) {
			this.seatnum = seatnum;
		}
		public String getFclass() {
			return fclass;
		}
		public void setFclass(String fclass) {
			this.fclass = fclass;
		}
	
}
