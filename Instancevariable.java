public class Instancevariable {

    // Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. 

    
        public String val ;
        public Instancevariable(){
                  val = "Instance variable";
        }
     
    public static void main(String[] args){

        Instancevariable mObject = new Instancevariable();

        System.out.println("It is an "+mObject.val );

    }
}
