import java.util.*;
public class solution{
	public static void main(String[] args){
		int[][] twodm = {{10, 20, 30, 50},{40, 50, 60, 20}};
		System.out.print("Original Array:\n");
		print_array(twodm);
		System.out.println("After changing the rows and columns of the said array:");
		transpose(twodm);
	}
	static void transpose(int[][] twodm) {
		int[][] newtwodm = new int[twodm[0].length][twodm.length];
		
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {
				newtwodm[j][i] = twodm[i][j];
			}
		}
		print_array(newtwodm);
	}
	static void print_array(int[][] twodm) {
		for (int i = 0; i < twodm.length; i++) {
			for (int j = 0; j < twodm[0].length; j++) {//where twodm[0] is index of 1st array{10,20,30}
				System.out.print(twodm[i][j] + " ");
			}
			System.out.println();
		}
	}
}