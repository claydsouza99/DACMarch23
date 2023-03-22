class Pattern10{
	public static void main(String args[]){
		for(int i=5;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			int ch=65;
			for( int k=i;k<=4;k++){
				System.out.print((char)(ch+k)+" ");
			}
			System.out.println();
		}
		
	}
}