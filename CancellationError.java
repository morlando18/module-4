
public class CancellationError {
	public static void main(String[] args){
		double sum = 0;
		for(int i = 1; i<=50000; i++){
			sum +=1.0/i;
		}
		System.out.println("sum is : " + sum);
		
		double sum2 = 0;
		for(int j = 50000; j>=1; j--){
			sum2 +=1.0/j;
		}
		System.out.println("sum2 is : " + sum2);
	}

}
