class Pattern18{
	public static void main(String args[]){
		for(int i=5;i>=1;i--){
			int ch=64;
			for (int j=1;j<=i;j++){
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
}
