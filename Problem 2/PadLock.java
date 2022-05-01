import java.util.Scanner;
class PadLock{
	static int abs(int x){
		return x<0?(x=(-1)*x):x;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		int cases=scan.nextInt(),min,sum=0;
		String str[]=new String[cases],str1[]=new String[cases];;
		for (int i=0;i<cases ;i++ ) {
			str[i]=scan1.nextLine();
			str1[i]=scan1.nextLine();
		}
		for (int i=0;i<cases ;i++ ) {
			for (int j=0;j<str[i].length() ;j++ ) {
				min=abs((int)(str[i].charAt(j)-str1[i].charAt(0)));
				for (int k=0; k<str1[i].length();k++ ) {
					if(min>=abs((int)(str[i].charAt(j)-str1[i].charAt(k)))){
						min=abs((int)(str[i].charAt(j)-str1[i].charAt(k)));
					}
					else if(((int)(abs(str[i].charAt(j)-str1[i].charAt(k)))==26)){
						if(min>1)
							min=1;
					}
				}
				sum+=min;
				min=0;
			}
			System.out.println(sum);
			sum=0;
		}
	}
}