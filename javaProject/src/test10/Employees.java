package test10;

public class Employees {
		private String name;
		private Date birthDate;
		
		public Employees(String name, Date birthDate) {
			super();
			this.name = name;
			this.birthDate = birthDate;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
		}
		
		
	}


