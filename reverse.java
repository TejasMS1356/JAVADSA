public class reverse {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum);
    }
   static int sum=0;
    static void rev(int n){
        if(n==0){
            return ;
        }
        sum=sum*10+n%10;
        rev(n/10);

    }

}
