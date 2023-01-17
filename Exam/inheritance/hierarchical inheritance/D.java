class A //Super class
{
 void input(){
  System.out.println("Enter Your Name:-");
 }}
class B extends A //Sub class 1
{
 void show(){
  System.out.println("My Name is rohan");
 }}
class C extends A //Sub class 2
{
 void Disp() {
  System.out.println("My Name is rohan");
 }
}
class D
{
 public static void main(String[] args) {
  B r=new B();
  C r2=new C();
  r.input(); r.show(); r2.input(); r2.Disp();
 }
}
