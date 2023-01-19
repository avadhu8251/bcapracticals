class Shape 
{
    void draw() 
   {
      System.out.println("Can't say shape type.");
   }
}

class Square extends Shape 
{
   @Override
   void draw() 
   {
      System.out.println("Square shape.");
   }
}

class Demo
{
   public static void main(String[] args) 
   {
      Shape r= new Square();
      r.draw();
   }
}
