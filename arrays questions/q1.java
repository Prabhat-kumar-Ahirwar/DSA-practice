public class q1 {
	public static void main(String[] args){
        int count=0;	
		int arr[]={2,3,2,2,3};
        int n = arr.length;
		for(int i=0;i<n;i++){
            boolean isDuplicate = false;
	    	for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
			}
            if(! isDuplicate){
                count++;
            }
		}
        System.out.println("answer: "+ count);
	}
}

