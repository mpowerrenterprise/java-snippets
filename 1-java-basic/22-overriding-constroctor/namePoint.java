import java.awt.Point;

class namePoint extends Point{

  String name;

  namePoint(int x,int y,String name){

   super(x,y);
   this.name=name;

  }

  public static void main(String[]args){

  	namePoint np=new namePoint(5,5,"Guna");
  	System.out.println(np.x);
  	System.out.println(np.y);
  	System.out.println("The name is "+np.name);
  }

}