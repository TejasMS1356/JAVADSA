import java.util.Arrays;

public class preety {
    public static void main(String[] args) {
        float a=453.2334f;
        int[] arr= {1,2,3};
        System.out.printf("formatted no is %.3f\n",a);
        System.out.println('a'+'b');//adding the ascii values
                System.out.println("a"+"b");//concatinate the two string
                System.out.println((char)('a'+3));//converting it into haracter and then incrementing
                System.out.println("a"+3);//integer is converted to integer that will call tostring and it is converted to string
System.out.println("tejas"+new int[] {1,2,3});//tejas[I@3b9a45b3
System.out.println("tejas"+Arrays.toString(arr));//tejas[1, 2, 3]
        
    }
    
}
