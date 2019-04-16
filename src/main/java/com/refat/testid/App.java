package com.refat.testid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
      Student[] studentArray = new Student[5];
        Student student1 = new Student();
        student1.setId("1");
        student1.setName("Refat");
       // studentArray[0] = student1;
        
        Student student2 = new Student();
        student2.setId("2");
        student2.setName("Ana");
       // studentArray[1] = student2;
        
        Student student3 = new Student();
        student3.setId("3");
        student3.setName("Kamrul");
       // studentArray[2] = student3;
        Student student4 = new Student();
        student4.setId("4");
        student4.setName("Joyee");
        
        Student student5 = new Student();
        student5.setId("5");
        student5.setName("Daud");
        
        Student student6 = new Student();
        student6.setId("6");
        student6.setName("Rashadin");
        
		/*
		 * for(int i = 0; i<3; i++) { System.out.println("Id: "+
		 * studentArray[i].getId()); System.out.println("Name: "+
		 * studentArray[i].getName()); }
		 */
        
        Department dept = new Department();
    
        dept.add(student1);
        dept.add(student2);
        dept.add(student3);
        dept.add(student4);
        dept.add(student5);
        dept.add(student6);
        
        
        //System.out.println("\nhello");
        
        Institute inst = new Institute();
        Department dept1 = new Department();
        dept1.setDeptName("CSE");
        
        Department dept2= new Department();
        dept2.setDeptName("EEE");
        
        inst.add(dept1);
        inst.add(dept2);
        
        MyList<Student> myStuList= new MyList<Student>();
        myStuList.add(student1);
        myStuList.add(student2);
        MyList<Student> myStuList1= new MyList<Student>();
        myStuList1.add(student6);
      
        MyList<Department> myDeptList= new MyList<Department>();
        myDeptList.add(dept1);
        myDeptList.add(dept2);
        myStuList.remove(0);
		System.out.println(myStuList.get(0).getName());
		System.out.println(myDeptList.get(0).getDeptName());
		List<Student> stdList = new ArrayList();
		myStuList.addAll(myStuList1);
		
		
	
    
      
       
        

    }
}
