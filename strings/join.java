package strings;
public class join {
    public static void main(String[] args) {
    //Join date parts into full date

    String[] dates = {"01","08","2025"};
    String printdate = String.join(":",dates);
    System.out.println("date print : "+printdate);

    }
}
