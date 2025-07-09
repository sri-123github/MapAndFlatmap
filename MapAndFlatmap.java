package Map;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatmap {
	public static void main(String[] args) {
		List<String> companies1 =  Arrays.asList("hcl","wipro","capgemini","amazon");
		employeelist employee1 = new employeelist(1, companies1);
		
		
		List<String> companies2 =  Arrays.asList("hcl","wipro","xyz","123");
		employeelist employee2 = new employeelist(2, companies2);
		
		
		List<String> companies3 = Arrays.asList("hcl","tcs","abc","amazon");
		employeelist employee3 = new employeelist(3, companies3);
		
		
		List<employeelist> employees = Arrays.asList(employee1,employee2,employee3);
		
		
Set<String> li=	employees.stream().flatMap(x->x.getPreviouscompanies().stream()).collect(Collectors.toSet());
		System.out.println(li);
		
		
	}
	
	

}

 class employeelist{
	private int empid;
	List<String> previouscompanies;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public List<String> getPreviouscompanies() {
		return previouscompanies;
	}
	public void setPreviouscompanies(List<String> previouscompanies) {
		this.previouscompanies = previouscompanies;
	}
	
	public String toString() {
		return "Employee [empid=" + empid + ", previouscompanies=" + previouscompanies + "]";
	}
	public employeelist(int empid, List<String> previouscompanies) {
		super();
		this.empid = empid;
		this.previouscompanies = previouscompanies;
	}
	
	
	
}
