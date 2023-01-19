class A
{
 int a; String b; boolean c;
 A()
 {
   a=1020; b="rohan"; c=true;
 }
 void Disp()
 {
  System.out.println(a+" "+b+" "+c);
 }
}
class B
{
 public static void main(String[] args)
 {
  A r=new A();
  r.Disp();
 }
}
