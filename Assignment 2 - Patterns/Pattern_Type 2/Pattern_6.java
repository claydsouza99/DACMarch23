class Pattern_6{
public static void main(String args[]){
	for( int i=1;i<=5;i++){
		for( int k=0;k<=i;k++){
			System.out.print(" ");
		}
		for (int j=i;j<=5;j++){
			System.out.print("*");
		}
		for( int l=4;l>=i;l--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
	