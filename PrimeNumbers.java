
public class PrimeNumbers {

	public static void main(String[] args){
		int jump = 0;
		for(int i = 2; i<1000; i++){
			int count = 0;
			for(int j=1;j<1000; j++){
				if((i/(double)j - i/j == 0 )){
					count++;
				}
			}
			if(count == 2){
				System.out.print(i + " ");
				jump++;
				if(jump % 8 == 0){
					System.out.println();
				}
			}
			
		}
	}
}
