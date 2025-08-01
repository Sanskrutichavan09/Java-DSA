package strings;
public class split {
    public static void main(String[] args) {
        //Split Full name into First and Last Name
        String fullname = "sanskruti balaji chavan";
        String[] splitfullname = fullname.split(" ");
        for(int i=0;i<splitfullname.length;i++){
          System.out.println(i +" : " +splitfullname[i]);
        }
   

    }

  
}
