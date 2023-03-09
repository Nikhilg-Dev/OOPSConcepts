
public class AboutString {
    public static void main(String[] args) {
        String s1="nikhil";
        String s2=s1+" gupta";
        String s3="nikhil";
        StringBuilder stringBuilder=new StringBuilder("AboutString");
        StringBuilder stringBuilder1=new StringBuilder("AboutString");
        if(s1.equals(s3)){                         //// same reference
            System.out.println("string");
        }
        if(stringBuilder.equals(stringBuilder1)){   /// they are at different references
            System.out.println("object");
        }


    }
}
