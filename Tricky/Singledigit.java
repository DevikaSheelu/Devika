package Tricky;

public class Singledigit {
	public static void main(String[] args) {
		int num=868;
		while(num>9){
			int sum=0;
			while(num!=0){
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
		}
		int no=num;
		int fact=1;
		for(int i=no;i>=1;i--){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}


