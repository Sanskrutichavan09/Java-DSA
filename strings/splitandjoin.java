package strings;

public class splitandjoin {

    public static void main(String[] args) {
        //split and join 


        //split 
         String city ="Pune Mumbai Latur Nagpur nashik Thane";
        
        String[] cityArray = city.split(" ");
      

        for(int i=0;i<cityArray.length;i++){
            System.out.println(" split : "+cityArray[i]);
          

        }

        //join

        
       String skills = "java html css reactjs mongodb sql ";
         String result = String.join(" ",skills);
       System.out.println("join : "+result);

    }
}