public class Array {
    public static void main(String[] args) {
        int[][] arr_value = {{10,20,30,40,50,60,70},{80,90,100,110,120,130}};
        for (int i=0;i<arr_value.length;i++){
            for (int j=0;j< arr_value.length;i++){
                System.out.println(arr_value[i][j]);
            }
        }
    }
}
