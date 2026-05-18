public class numbersingle {
    public static void main(String[] args) {
        int  nums[] = {2,2,1};
        int count=0;
        for(int  i =0;i<nums.length;i++){
            for(int  j=i;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                    count++;
                 }
            }
            
            if(count==1){
                System.out.print(nums[i]);
            }
            else{
                System.out.print("no single number");
            }
        }
        
    }
}
