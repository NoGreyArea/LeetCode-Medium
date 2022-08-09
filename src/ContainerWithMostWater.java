import java.util.Scanner;

public class ContainerWithMostWater {

	public void maxArea(int[] height) {

		int left = 0;
		int right = height.length-1;
		int width = height.length-1;
		int min;
		int maxArea=0;
		int temp;

		while(left!=right) {
			min = Math.min(height[left], height[right]);

			temp = min * width;

			if(temp>maxArea)
				maxArea = temp;

			if(height[left]<height[right]) {
				left++;
			} else
				right--;
			width--;
		}
		
		System.out.println(maxArea);

	}

	public static void main(String args[]) {

		ContainerWithMostWater ob = new ContainerWithMostWater();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter " + n + " numbers:\n");
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		in.close();
		ob.maxArea(a);
	}

}
