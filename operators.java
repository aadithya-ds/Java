public class operators {
    public static void main(String[] args){
//          Arithmetic operators

int a = 5;
int b = 10;
 
System.out.println("Addition : "+ (a+b));
System.out.println("Subtraction : "+ (b-a));
System.out.println("Multiplication : "+ (a*b));
System.out.println("Division : "+ (b/a));
System.out.println("Modulo : "+ (b%a));

// Assignment operators

int c=5; //equal
c+=5;
System.out.println("add equal:"+c);
c-=2;
System.out.println("sub equal:"+c);
c/=2;
System.out.println("divide equal:"+c);
c%=2;
System.out.println("modulo equal:"+c);





// Comparison operators

System.out.println(" equal to:"+ (a == b ));
System.out.println(" Not equal to:"+ (a != b ));
System.out.println(" Greater than:"+ (a > b ));
System.out.println(" Lesser than:"+ (a < b ));
System.out.println(" Greater than equal to:"+ (a >= b ));
System.out.println(" less than equal to:"+ (a <= b ));



// Logical operators

System.out.println(" Logical and:"+ (a>5 && b<10 ));
System.out.println(" Logical or:"+ (a == b || a<b ));
System.out.println(" Logical not:"+ (!(a>b) ));

// Bitwise operators

System.out.println(" Bitwise And:"+ (a & b ));
System.out.println(" Bitwise Or:"+ (a | b ));
System.out.println(" Bitwise Xor:"+ (a ^ b ));
System.out.println(" Bitwise Not:"+ (~a ));

    } 
}
