public class HalfPyramid2{
    public static void main(String[] args) {
        int n = 5;

        for (int i=n;i>=1;i--){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print("X ");
            }
            
        }
    }
}

// X X X X X 
// X X X X
// X X X
// X X
// X