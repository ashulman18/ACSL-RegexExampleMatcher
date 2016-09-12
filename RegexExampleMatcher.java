//Andrea Shulman
//Contest 4
//03/31/16

import java.util.regex.*;  
class RegexExampleMatcher{  
public static void main(String args[])
{  
  String content = "#, xx, xyzz, xzz, xxyyzz, xyz, xxyz, xyzzz, yzz, xxxyz";
  String string = "x.y.z";
  Pattern pattern = Pattern.compile(string);
  Matcher matcher = pattern.matcher(content);
  boolean flag = false;
  if(!matcher.find())
   System.out.println("NONE");
  else
  {
      if((content.substring(matcher.start()-1,matcher.start())).equals(" ")&&((matcher.end()==content.length())||(content.substring(matcher.end()+1,matcher.end()+2)).equals(" ")))
       flag = true;
      else
         flag = false;
      if(flag)
         System.out.println(content.substring(matcher.start(),matcher.end()));
      else
         System.out.println("NONE");
  }
  while(matcher.find())
  {
      if((content.substring(matcher.start()-1,matcher.start())).equals(" ")&&((matcher.end()==content.length())||(content.substring(matcher.end()+1,matcher.end()+2)).equals(" ")))
       flag = true;
      else
         flag = false;
      if(flag)
         System.out.println(content.substring(matcher.start(),matcher.end()));
      
  }
}
}