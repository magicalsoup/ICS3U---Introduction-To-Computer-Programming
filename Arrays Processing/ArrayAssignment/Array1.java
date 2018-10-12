import java.util.*;
public class Array1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		sc.close();
	}
}
