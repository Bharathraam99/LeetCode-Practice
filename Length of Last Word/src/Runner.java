
public class Runner {

	public static void main(String[] args) {

		String s= "   fly me   to   the moon  ";
		String rev="";
		int count=0;
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		for(int i=0;i<rev.length();i++) {
			if(rev.charAt(i)!=' ') {
				count+=1;
			}
			else if(rev.charAt(i)==' ' && count>0) {
				break;
			}
		}
		
		System.out.println("Length of the Last Word is: "+count);
		
	}

}
