package com.hspedu.homework.homework13;

public class Homework13 {
public static void main(String[]args) {
	Student student1 = new Student("小明",'男',12,"00023102");
	student1.printInfo();
	Teacher teacher1 = new Teacher("张飞",'男',30,10);
	teacher1.printInfo();
	Person[] persons = new Person[4];
	persons[0] =new Student("jack",'男',13,"00013102");
	persons[1] =new Student("mary",'女',12,"00023102");
	persons[2] =new Teacher("smith",'男',33,5);
	persons[3] =new Teacher("scott",'男',36,10);
	
	
	Homework13 homework13 = new Homework13();
	homework13.bubbleSort(persons);
	System.out.println("===========排序后的数组===========");
for(int i=0;i<persons.length;i++) {
	System.out.println(persons[i].toString());
}
	System.out.println("===================");
	for(int i=0;i<persons.length;i++) {
		homework13.test(persons[i]);
}
}
public void test(Person p) {
	if(p instanceof Student) {
		((Student)p).study();
	}else if  (p instanceof Teacher){
		((Teacher)p).teach();
	}else {
		System.out.println("do noting...");
		
	}
}



public void bubbleSort(Person[] persons) {
	Person temp = null;
	for (int i = 0;i<persons.length-1;i++) {
		for(int j=0;j<persons.length-1-i;j++) {
			if(persons[j].getAge()<persons[j+1].getAge()) {
				
			
			temp = persons[j];
			persons[j]=persons[j+1];
			persons[j+1] = temp;
			}
		}
	}
}
}
