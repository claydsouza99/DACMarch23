class pyramidPattern_5{
	public static void main(String args[]){
		for(int i=9;i>=1;i--){
			for(int k=i;k>1;k--){
				System.out.print("  ");
			}
			for(int j=i;j<=9;j++){
				System.out.print(j+" ");
			}
			for(int l=9;l>i;l--){
				System.out.print((l-1)+" ");
			}
			System.out.println();
		}
	}
}