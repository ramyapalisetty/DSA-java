public class largest {
    public static int findLargest(int arr[]) {
        // code here
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={10,20,5,40};
        System.out.println(findLargest(arr));
    }
}