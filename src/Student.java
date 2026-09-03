
public class Student {
String FN;
String LN;
int Sid;
//0 parameters
Student(){
this.FN="No First Name";
this.LN="No Last name";
this.Sid=0;
}//three parameteres
Student(String FN, String LN, int Sid) {//oc
this.FN = FN;
this.LN = LN;
this.Sid = Sid;
}
//Student(String FN, String LN) {//oc
//            this.FN = FN;
//            this.LN = LN;// Sid isnt decalred so the deafult would be given
//        }

Student(String FN, String LN) {
this.FN = FN;
this.LN = LN;
}


//Methods= Getters and Setters
public String getFN() {
return FN;
}

public void setFN(String FN) {
this.FN = FN;
}

public int getSid() {
return Sid;
}

public void setSid(int sid) {
Sid = sid;
}

public String getLN() {
return LN;
}

public void setLN(String LN) {
this.LN = LN;
}

//you can create overloaded constructors by varying the parameter number, by varying the order(the sequence in which they are ex:stud(FN,LN, Sid) then using this.FN then Sid, string integer string

public static void main(String[] args) {
Student s4=new Student("Helena","Payton");
System.out.println(s4.FN);
System.out.println(s4.LN);//OC
System.out.println(s4.Sid);//OC
//Variable s1 is of student type
Student s1;
s1= new Student();
System.out.println(s1);
System.out.println(s1.FN);

Student s2;
s2= new Student("Tobiloba", "Ayodeji",14141);
System.out.println(s2.FN);
System.out.println(s2.LN);
System.out.println(s2.Sid);

Student s3;
String FN="Miguel";
String LN="Bascarortega";
int Sid=31415;
s3= new Student(FN,LN,Sid);
System.out.println(s3.FN);
System.out.println(s3.LN);
System.out.println(s3.Sid);

Student s5;
s5=new Student();


}

}
