class A //Super class
{
  int a,b,c;
  void add()
  {
    a=10; b=20;
    c=a+b;
    System.out.println("Sum of two numbers:-"+c);
  }
  void sub()
  {
    a=100; b=20;
    c=a-b;
    System.out.println("Substraction of two numbers:-"+c);
  }
}
class B extends A //Sub class 1
{
  void multi()
  {
    a=10; b=20;
    c=a*b;
    System.out.println("Multiplication of two numbers:-"+c);
  }
  void div()
  {
    a=100; b=20;
    c=a/b;
    System.out.println("Divison of two numbers:-"+c);
  }
}
class C extends B //Sub class 2
{  
  void rem()
  {
    a=10; b=20;
    c=a%b;
    System.out.println("Remainder of two numbers:-"+c);
  }
}
class T
{
 public static void main(String[] args)
  {
   C r=new C();
   r.add(); r.sub(); r.multi(); r.div(); r.rem();
  }
}  
