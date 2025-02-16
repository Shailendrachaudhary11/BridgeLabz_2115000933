public class TargetFind {

    public static int findTarget(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index=findTarget(arr,2);
        System.out.println(index);
    }
}
