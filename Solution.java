import java.util.*;


public class Solution{
    //#solid rectangle
    // public static void main(String arg[]){
    //     int n=4,m=6;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             System.out.print("*");
    //         }
    //         System.err.println();
    //     }
    // }
    //#endregion

     //#Hollow Rectangle 
    // public static void main(String arg[]){
    //     int n=4,m=4;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(i==0|| j==0|| i==n-1|| j==m-1){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    //#endregion

    //#Half Pyramid
    // public static void main(String arg[]){
    //     int n=4;
    //     for(int i=0; i<=n;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    //#endregion

    //#Inverted half pyramid 
    // public static void main(String arg[]){
    // int n=4;
    // for( int i=n;i>=0;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    // }
    // }
    //#endregion

    //#Inverted half Pyramid
    // public static void main(String arg[]){
    //     int n=4;
    //     for(int i=1; i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    //#endregion
    
    //#inverted half pyramid sapces first
    public static void main(String arg[]){
        int n=4;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

}