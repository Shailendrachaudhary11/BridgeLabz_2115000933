public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,4,2,1};
        int[] temp=new int[arr.length+2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) temp[arr[i]]=1;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0){
                System.out.println("Missing Number: "+i);
                return;
            }
        }
    }
}
