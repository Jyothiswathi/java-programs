package practiceExtentMaven.collections;

public class RemoveDulicatesInStripnpg {

	public static void main(String[] args) {
String s="jyothii";
String newStr="";

for(int i=0;i<s.length();i++)
{

char ch = s.charAt(i);
if(newStr.indexOf(ch)==-1)
{
	newStr=newStr+ch;
}
	
}
System.out.println(newStr);
	}

}
