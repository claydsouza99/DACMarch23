class Pattern9{
	public static void main(String args[]){
		for(int i=1; i<=5;i++){
		for(int k=4;k>=i;k--){
				System.out.print(" ");
		}
		int ch=64;
		for(int j=1;j<=i;j++){
			System.out.print((char)(ch+j)+" ");
		}
		System.out.println();
		}
		
	}
}