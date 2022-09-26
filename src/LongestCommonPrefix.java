import java.util.Scanner;

public class LongestCommonPrefix {

	public void longestCommonPrefix(String[] strs) {
		String first=strs[0];
		int len = strs.length;
		String res="";
		int count=0;
		if(len==1) {
			System.out.println(strs[0]);
		} else {
			for(int i=1;i<len;i++) {
				int l = Math.min(first.length(), strs[i].length());
				for(int j=0;j<strs[i].substring(0,l).length();j++) {

					if(strs[0].charAt(0)!=strs[i].charAt(0)) {
						res="";	
						count=1;
						break;
					}

					if(strs[0].charAt(j)==strs[i].charAt(j)) {
						res=res+strs[0].charAt(j);
					}			
					else {					
						break;
					}			
				}
				res=res+" ";
			}	

			res=res.trim();

			if(count==1) {
				System.out.println("Longest Common Prefix : ");
			} else {

				if(res.length()==1)
					System.out.println("Longest Common Prefix : " + res);
				else
					System.out.println("Longest Common Prefix : " + res.substring(res.lastIndexOf(' ')+1,res.length()));
			}

		}
	}

	public static void main(String args[]) {

		LongestCommonPrefix ob = new LongestCommonPrefix();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = in.nextInt();
		String[] str = new String[n];
		System.out.println("Enter " + n + " strings:\n");
		for(int i=0;i<n;i++) {
			str[i] = in.next();
		}
		in.close();
		ob.longestCommonPrefix(str);
	}

}
