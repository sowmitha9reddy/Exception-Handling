package Patterns;

import java.util.Scanner;


	

public class pattern1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
        // hallowSuqare(n);
         //countStartsinSuqare(n);
         //MutliplyingIandJSuqare( n);
        // mirrorTraingle( n);
         //RightAngleTraingle( n);
         //numberRightAngleTraingle( n);
         //reverseRightAngleTraingle( n);
         //hallowReverseRightAngleTraingle( n);
         //traingle( n);
         //halloTraingle(n);
         //oddStartRightAngleTraingle( n);
        // numebrOddRightAngleTraingle( n);
        // reverseoddStartRightAngleTraingle( n);
         reverseNumebrOddRightAngleTraingle( n);
	}
	static void hallowSuqare(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {
					System.out.print("*"+ " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	static void countStartsinSuqare(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
	static void MutliplyingIandJSuqare(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int m=i*j;
				if(m<10) {
					System.out.print("0");
				}
				System.out.print(m+ " ");
			}
			System.out.println();
		}
	}
static void mirrorTraingle(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
static void reverseRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		int count=i;
		for(int j=1;j<=(n-i)+1;j++) {
			System.out.print(count++ +" ");
			
		}
		System.out.println();
	}
}
static void hallowReverseRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		int count=i;
		for(int j=1;j<=(n-i)+1;j++) {
			if(j==1||i==1||j==(n-i)+1) {
			System.out.print(count +" ");
			}
			else {
				System.out.print("  ");
			}
			count++;
			
		}
		System.out.println();
	}
}
static void RightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
			if(i==n||j==1||j==i) {
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
static void numberRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
			if(i==n||j==1||i==j) {
			System.out.print(j +" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
static void MirrorRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==n||j==1||i==j) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
static void traingle(int n) {
	
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
			
		}
		System.out.println( );
	}
   }
static void halloTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(j==i||j==1||i==n) {
			System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			
		}
		System.out.println( );
	}
   }
static void oddStartRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=(2*i)-1;j++) {
			
			System.out.print("* ");
			
			
		}
		System.out.println( );
	}
   }
static void reverseoddStartRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		for(int k=1;k<=(n-i);k++) {
			System.out.print("  ");
		}
		for(int j=1;j<=(2*i)-1;j++) {
			
			System.out.print("* ");
			
			
		}
		System.out.println( );
	}
   }
static void numebrOddRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		int count=1;
		for(int j=1;j<=(2*i)-1;j++) {
			if(j<i) {
			System.out.print(count++ +" ");
			}
			else {
				System.out.print(count-- +" ");
			}
			
			
		}
		System.out.println( );
	}
   }
static void reverseNumebrOddRightAngleTraingle(int n) {
	
	for(int i=1;i<=n;i++) {
		int count=1;
		for(int k=1;k<=n-i;k++) {
			System.out.print("  ");
		}
		for(int j=1;j<=(2*i)-1;j++) {
			if(j<i) {
			System.out.print(count++ +" ");
			}
			else {
				System.out.print(count-- +" ");
			}
			
			
		}
		System.out.println( );
	}
   }


}
