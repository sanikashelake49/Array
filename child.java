class child1
 {
   int x; 
   public static void main(int x)
     {
       //super.x=x; 

    //   System.out.println(x);

    }
}


class parent extends child1
   {
   int x;
  String name;

  public parent()
    {


    }
    public parent(int x,String name)
     {
      this.x=x;
      this.name=name;
   
   //  System.out.println(x); 
System.out.println("parent class");   
    }

  /* public static void main(int x , String name)
     {
     
       
     System.out.println("parent class");  


   }*/
}

class child
  {
    public static void main(String[]args)
       {
         //child1.main(2);
   parent p=new parent(2,"java");
   System.out.println(this.x); 

          //p.main(2,"java");
        //  p.main(2);
   }
 }