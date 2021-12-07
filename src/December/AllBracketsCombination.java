package December;

public class AllBracketsCombination {
	public static void main(String[] args)
	{
		print(new char[4],0,0,0,2);
	}

	public static void print(char[] s,int pos,int open , int close, int n)
	{
		if(close==n)
		{
			String str = new String(s);
			System.out.println(str);
			return;
		}
		else
		{			
			if(open < n) {
				s[pos]='{';
				print(s,pos+1,open+1,close,n);
			}
			if(open > close) {
				s[pos]='}';
				print(s,pos+1,open,close+1,n);
			}
		}
	}
}
