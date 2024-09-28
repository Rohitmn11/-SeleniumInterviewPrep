package Demo;


public class RevesreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "rohit Mane";
		String revtemp = "";
		String finalrev = "";
		String [] rev = str.split(" ");
		for(int i=0;i<rev.length;i++) {
			String temp = rev[i];
			for(int x=0;x<temp.length();x++) {
				char a = temp.charAt(x);
				revtemp = a + revtemp;
			}
			finalrev =  finalrev +" "+revtemp ;
			temp = "";
		}
		System.out.println(finalrev);
	}

}
