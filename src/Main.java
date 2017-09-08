public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		int n; 
		int id;
		 String fname;
		int marks;
		Date dob;
		System.out.println("Enter no.of students");
		n=s.nextInt();
		s.nextLine();
		ArrayList studentArray=new ArrayList(n);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			name=s.nextLine();
			System.out.println("Enter id");
			id=s.nextInt();
			System.out.println("Enter marks");
			marks=s.nextInt();
			System.out.println("Enter dob");
			dob=s.nextLine();
		}
		StudentArray.add(new Student(name,id,marks,dob));
		for (ListIterator s = student.listIterator(); s.hasNext(); ) {
			Student st = (Student)s.next();
			System.out.println(st);
		}
		
		ListIterator sl = studentArray.listIterator();
		
	    while (studentIterator.hasNext()) {
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}	
	}
}


}	
		

		
	}



			
		
		
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
