

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        // int m = 5;
        // int number = 1;

        //outter forloop  
        // for(int i=1; i<=n; i++){
        //     //inner forloop
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //nested loop  Rectangle
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         //cell ->(i,j)
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //Half pyramid
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //inverted half paramid
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //inverted half paramid by 180deg
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half Paramid with number
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //          System.out.print(j+" ");
    //         }
    //         System.out.println();    
    //     }

            //inverted half paramid with numbers
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i+1; j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            
            //floyds triangle
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=i; j++){
            //         System.out.print(number+" ");
            //         number++;
            //     }
            //     System.out.println();
            // }

            //  0-1 triangle
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    int sum = i+j;
                    if(sum % 2 == 0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }

    }
}
