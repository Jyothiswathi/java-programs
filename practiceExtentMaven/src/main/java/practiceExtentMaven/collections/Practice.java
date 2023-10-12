package practiceExtentMaven.collections;

import java.util.HashSet;
import java.util.Set;

public class Practice {

public static void main(String args[])
{
	
String s[]= {"joy","jyo","joy"};
Set<String> set = new HashSet<String>();
for(String eachString:s)
{
	if(set.add(eachString)==false)
	{
		System.out.println(eachString);
	}
}


}

}
