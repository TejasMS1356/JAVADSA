public class string {
    public static void main(String[] args) {
        //in the memory string pool is there it is seperate memory in which if you have given same name of the string for two diff variables th
        //then it will be stored once in string pool
        /* imutable if you change the referce of one object then it will not reflect in the another object*/
        String a="tejas";
        String b="tejas";
        b="kunal";//kunal is new object and tejas is not erasing
        System.out.println(a);
        System.out.println(b);
         if(a==b){
            System.out.println("true");
        }else{
            System.out.println("false");//printed
        }
    
        //to create a two different references of same object  then we have to use new key word
        String c=new String("tejas");
        String d=new String("tejas");
        if(c==d){
            System.out.println("true");
        }else{
            System.out.println("false");//printed
        }
    }
    
}
                                           
