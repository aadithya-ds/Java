public class classobject {

    //class and objects and static variable and static methods and constructor.

        int x = 5;
        int s,t;

        public static int svar= 10; 

        public static int multiply(int n,int y){
            return n*y;

        }
              

      
        public static void main(String[] args) {
          classobject myObj = new classobject(); //created an object


          System.out.println(myObj.x);

          System.out.println(classobject.svar);

         System.out.println("Calling a sttic method Multiply:"+multiply(10,10));

         




        }
      
    
}
