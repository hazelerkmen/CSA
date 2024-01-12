public class Strings {
    public static void main(String[] args){
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2024 becomes " + dateString2("4/2/2024"));

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
    }

    public static String scroll(String s){
        String s1=s.substring(1);
        s1+=s.charAt(0);
        return s1;
    }

    public static String convertName(String s){
        String first=s.substring(s.indexOf(",")+1);
        String last=s.substring(0,s.indexOf(","));
        String full=first.trim() + " " + last.trim();
        return full;
    }

    public static String negative(String s){
        String s1=s.replace("0","one");
        String s2=s1.replace("1","0");
        String s3=s2.replace("one","1");
        return s3;
    }

    public static String dateString(String dateStr){
        String s= dateStr.substring(3,5)+"-"+dateStr.substring(0,2)+"-"+dateStr.substring(6,10);
        return s;
        }
    

    public static String dateString2(String dateStr){
        int firstSlash=dateStr.indexOf("/");
        int secondSlash=dateStr.lastIndexOf("/");
        String month=dateStr.substring(0,firstSlash);
        String day=dateStr.substring(firstSlash+1,secondSlash);
        String year=dateStr.substring(secondSlash+1,dateStr.length());
        if (firstSlash<2)
            month="0"+month;
        if (day.length()<2)
            day="0"+day;
        String date=day+"-"+month+"-"+year;
        return date;
    }

    public static boolean startsWith(String s, String prefix){
        if (prefix.length()>s.length())
            return false;
        String check = s.substring(0,prefix.length());
        return check.equals(prefix);
    }
    
    public static boolean endsWith(String s, String suffix){
        if (suffix.length()>s.length())
            return false;
        String check = s.substring(s.length()-suffix.length(), s.length());
        return check.equals(suffix);
    }
}
