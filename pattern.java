public class pattern {
    public static void main(String[] args) {
        pt1(5);
        pt2(5);
        pt3(5);
        pt4(5);
   
    }
    static void pt1(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("*");

            }
            System.out.println("\n");
        }
    }
     static void pt2(int n){
       for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                System.out.print("*");

            }
            System.out.println("\n");
        }

     }
     static void pt3(int n){
       for(int r=n;r>=1;r--){
            for(int c=1;c<=r;c++){
                System.out.print("*");

            }
            System.out.println("\n");
        }

     }
     static void pt4(int n){
       for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print(c);

            }
            System.out.println("\n");
        }

     }
     
}
