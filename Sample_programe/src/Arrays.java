
public class Arrays {
	/*  * we can store multiple data ( same data type ) in a single variable
	    * continous memory allocation (storage) 
	    * Start form 0 index
	    * single dimensional array, 2, 3 and many
	 */
	public static void main(String args[]) {
		/*------------------------------------Single dimensional array ----------------------------------*/
		/*
		int[] ref=new int[5];
		ref[0]=11;
		ref[1]=22;
		ref[2]=33;
		ref[3]=44;
		ref[4]=55;
		//System.out.println(ref[2]);
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]);
		}
		*/
		/*------------------------------------Multi dimensional array ----------------------------------*/
		int[][] ref=new int [3][2];
		ref[0][0]=11;
		ref[0][1]=11;
		ref[1][0]=11;
		ref[1][1]=11;
		ref[2][0]=11;
		ref[2][1]=11;
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(ref[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
// Iam the prod