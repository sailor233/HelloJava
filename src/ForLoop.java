
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for(int i=0;i<=100;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
//		
//		
//		int[] nums = {1, 4, 9, 16, 25}; 
//		int sum2 = 0;
//		for(int i=0;i<nums.length;i++) {
//			sum2 += nums[i];
//		}
//		System.out.println(sum2);
//		
//		for(int n:nums) {
//			System.out.println(n);
//		}
//		
//		for (int i=nums.length -1 ; i>=0; i--) {
//            System.out.println(nums[i]);
//        }
//		
//		
//        int sum3 = 0;
//        for (int n:nums) {
//        	sum3+=n;
//        }
//        System.out.println(sum3); // 55
        
        
        
        double pi = 0;
        int x = 1;
        for (int n=1;n<=1000000;n++) {
        	pi = pi + x*(1.0/(2*n-1));
        	x = -1*x;
        }
        pi = pi*4;
        System.out.println(pi);
		
	}

}
