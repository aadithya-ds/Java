public class constructor {

    int s,t;

    public constructor(int v,int j){
        s=v;
        t=j;
     }
     public int add(){
         return s+t;
     }
    public static void main(String[] args){

        constructor myobj1 = new constructor(10,10);

        System.out.println("After assinging value using constructor:"+ myobj1.add());
    }
}
