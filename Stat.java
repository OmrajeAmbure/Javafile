import java.util.*;

class Stat{
	void mean(int arr[],int len){
		// (value/len) = mean
		float sum = 0;
		for(int i=0;i<len;i++){
			sum = sum + arr[i];
		}
		System.out.println("Mean :- "+(float)(sum/len));
	}
	void median(int arr[],int len){
		Arrays.sort(arr);
		double median;
		if(len % 2==0){
			median = (arr[len / 2 - 1] + arr[len / 2])/2.0;
		}else{
			median = arr[len/2];
		}
		System.out.println("Median :- "+ median);
	}
	void mode(int arr[],int len){
		 int maxCount = 0;
        	 int mode = arr[0]; // Default mode
        
        	for (int i = 0; i < len; i++) {
            		int count = 0; // Reset count for each element
            
            		for (int j = 0; j < len; j++) {
                		if (arr[i] == arr[j]) { // Compare with all elements
                    			count++;
                		}
            		}
            
            // Update mode if a higher frequency is found
            	if (count > maxCount) {
                	maxCount = count;
                	mode = arr[i];
            	}
        	}
		 System.out.println("Mode :- " + mode); 
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Value You Can Given :- ");
		int num = sc.nextInt();
		int value[] = new int[num];
		for(int i=0;i<value.length;i++){
			value[i] = sc.nextInt();
		}
		int len = value.length;
		Stat st = new Stat();
		st.mean(value,len);
		st.median(value,len);
		st.mode(value,len);
	}
}