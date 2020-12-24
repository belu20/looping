
 public class segitabil {
     public static void main(String[] args) {
         for (int x=0; x<4; x++) {
             for (int y=0; y<5; y++) {
                 if (y==0 || y==2 || y==4){
                     System.out.print("x ");
                 } else {
                     System.out.print("0 ");
                 }
             }
             System.out.println();

         }
         System.out.print("\n");
         int a=4;
         for (int x=1; x<=a; x++) {
             for (int y = a - x; y < 5; y++) {
                 if ( y == 1 || y == 3 ) {
                     System.out.print("X ");
                 } else
                     System.out.print("0 ");
             }
             for (int z = 3; z >= x; z--) {
                 if (z==3 || z==1) {
                     System.out.print("X ");
                 }else
                     System.out.print("0 ");
             }
             System.out.print("\n");
         }
         System.out.println("\n");
         int c=5;
         for (int x=1; x<=5; x++){
             for (int b=c; b>=x; b--){
                 if (x < 3){
                     System.out.print(x+" ");
                 }else
                     System.out.print(5-2+" ");
             }
             System.out.print("\n");
         }
         System.out.println("\n");
         for (int x=1; x<=5; x++){
             for (int b=x; b<=5; b++) {
                 System.out.print(b+" ");
             }
             System.out.println();
         }
         System.out.print("\n");
         int t = 5;
         for (int x=1; x<=5; x++){
             for (int b=2; b<=x; b++){
                 System.out.print("  ");
             }
             for (int y=t; y>=x; y--){
                 System.out.print(y+" ");
             }
             for (int z=x+1; z<=t; z++){
                 System.out.print(z+" ");
             }
             System.out.print("\n");
         }
     }
 }