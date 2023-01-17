class student //super class
{
  int roll, marks;
  String name;
  void input()
  {
   System.out.println("Enter roll name & marks");
  }
}
  class rohan extends student //sub class
  {
    void disp()
     {
       roll=1; name="rohan"; marks=89;
       System.out.println(roll+" "+name+" "+marks);
     }
  public static void main(String[] args)
     {
      rohan r=new rohan();
      r.input(); r.disp(); 
     }
}
