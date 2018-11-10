
public class PrintNumbersWith3x3GridStyling {

	public static void main(String[] args) {
		String n = "1948938291924";
        String[] nArray = n.split("");
        int[] ar = new int[nArray.length];
        for (int i = 0; i < ar.length; i++){
           ar[i] = Integer.parseInt(nArray[i]);
           }
          print(ar);
	}
	 public static void print(int[] arr){
		 
		String[][] zero = {{".","_","."},
				 		  {"|",".","|"},
				 		  {"|", "_","|"}};
		String[][] one = {{".",".","."},
		                 {".",".","|"},
		                 {".", ".","|"}};
		String[][] two = {{".","_","."},
		                  {".","_","|"},
		                  {"|", "_","."}};
		String[][] three = {{".","_","."},
		                    {".","_","|"},
		                    {".", "_","|"}};
		String[][] four =  {{".",".","."},
		               		{"|","_","|"},
		               		{".", ".","|"}};
		String[][] five =  {{".","_","."},
		               		{"|","_","."},
		               		{".", "_","|"}};
		String[][] six =  {{".","_","."},
		               	   {"|","_","."},
		                   {"|", "_","|"}};
		String[][] seven = {{".","_","."},
		                   {".",".","|"},
		                   {".", ".","|"}};
		String[][] eight ={{".","_","."},
		                   {"|","_","|"},
		                   {"|", "_","|"}};
		String[][] nine = {{".","_","."},
		                   {"|","_","|"},
		                   {".", ".","|"}};
String[][][] nums = {zero, one, two, three, four, five, six, seven, eight, nine};
String[][][] printMe = new String[arr.length][3][3];
for (int i = 0; i < arr.length; i++) {
	printMe[i] = nums[arr[i]];
}
		 for (int i = 0; i < 3; i++){
			 for (int j = 0; j < printMe.length; j++) {
				 for (int k = 0; k < 3; k++) {
					 System.out.print(printMe[j][i][k]);
				 }
				 System.out.print(" ");
			 }
			 System.out.println("");
		 }
	 }

}
