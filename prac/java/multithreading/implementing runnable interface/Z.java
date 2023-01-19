class Y implements Runnable
{
 public void run()
  {
   for(int i=1;i<=5;i++)
    {
     System.out.println("Virus is Thread");
    }
  }
}
class Z 
{
 public static void main(String[] args)
  {
   Y r=new Y();

   Thread t=new Thread(r);
   t.start();
  }
}
