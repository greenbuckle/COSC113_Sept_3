
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
    Student(String FN, String LN, int Sid){
    this.FN=FN;
    this.LN=LN;
    this.Sid=Sid;

    }
    public static void main() {
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
    }

}
