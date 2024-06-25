package com.ArrayList;
import java.util.ArrayList;
import java.util.List;
public  class EmployeeMethod {
	
	public  List <DynamicValue>  getEmployeeList() {
		List<DynamicValue> l = new ArrayList<DynamicValue>();
		l.add(new DynamicValue( "ajay","deshmukh"));
		l.add(new DynamicValue("ram","pawar"));
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
