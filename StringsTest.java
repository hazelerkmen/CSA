public class StringsTest{
    public static void main(String[] args){
        printBackward("h");
        printBackward("");
        printBackward("hi");
        printBackward("hello there!");
        System.out.println(removeAll("Summer is here!",'e'));
        System.out.println(removeAll("Earthy eats", 'e'));
    }
    public static void printBackward(String s){
        System.out.println("start");
        String backward="";
        if (s.length()>1){
            backward+=s.substring(s.length()-1);
            for (int i=s.length()-2; i>=0; i--){
                backward+=s.substring(i,i+1);
            }
            System.out.println(backward);
        }
        else
            System.out.println(s);
        System.out.println("finish");
        }

        public static String removeAll(String s, char ch){
            String removed="";
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i)!=ch)
                    removed+=""+s.charAt(i);
            }
            return removed;
        }
    
    }