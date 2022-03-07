import java.util.ArrayList;
import java.util.Scanner;

public class Assess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int size = Integer.parseInt(scn.nextLine());
	        ArrayList<Integer> numList = new ArrayList<>();
	        for(int i = 0;i < size;i++){
	            numList.add(scn.nextInt());
	        }
	        int n = scn.nextInt();
	        scn.nextLine();
	        for(int i = 0;i < n;i++){
	            String str = scn.nextLine();
	            if(str.equals("Insert")){
	                String[] queryArray = scn.nextLine().split(" ");
	                numList.add(Integer.parseInt(queryArray[0]),Integer.parseInt(queryArray[1]));
	            }else if(str.equals("Delete")){
	                int removeIndex = Integer.parseInt(scn.nextLine());
	                numList.remove(removeIndex);
	            }
	        }
	        for(Integer num : numList){
	            System.out.print(num+" ");
	        }

	}

}
