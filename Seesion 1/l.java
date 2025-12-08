
import java.util.Arrays;
class Test
{
	public static void main(String[] args) {
	    int arr[] ={1,5,6,6,7,8,9,10,11,12,32};
	    int m = arr.length;
	    int left = 0;
	    int right = m-1;
	    int target = 9;
	    while(left<=right){
	        int mid =(left + right)/2;
	    
            if(arr[mid] == target){
	            System.out.println(mid);
                return;
	        }
	        else if(target < arr[mid]){
	            right = mid -1;
	        }
	        else{
	            left = mid + 1;
	        }
        }
	    
	    
		
	}
}