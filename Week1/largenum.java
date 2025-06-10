public class largenum {

    public static void main(String[] args) {
        int A = 0;
       int arr[] ={1,8,7,56,90};
        for(int i =0;i<arr.length;i++){

            if(arr[i]>A){
                A=arr[i];
            }
        }
      System.out.println(A);
    }
}