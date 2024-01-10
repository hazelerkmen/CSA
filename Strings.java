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
        String s=dateStr.replace("/","-");

        String month=dateStr.substring(0,2);

        String day=dateStr.substring(3,5);

        String s1=s.replace(month, "da");

        String s2=s1.replace(day,month);

        String s3=s2.replace("da",day);
        System.out.println(day);
        return s3;


        }
    }
