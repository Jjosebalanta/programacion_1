public class ejecicios3 {
    public static void main(String[] args) {
        boolean a, c, b;
        a = b = c = true;
        if (!a && (b && c)) {
            System.out.println("sentencia if ejecutada ");
        } else {
            System.out.println("sentencia else ejecutada");
        }
        // *********************
        System.out.println("--------");
        int marks = 80;

        if (marks > 70)
            System.out.println("distincion");
        if (marks > 35)
            System.out.println("pass");
        else
            System.out.println("falso");
        System.out.println("batter luck next tine");
        // ****************
        System.out.println("----------");

        int indian_score = 300, pakistan_score = 290;

        if (indian_score > pakistan_score)
            System.out.println("indian wins");
        else
            System.out.println("pakistan wins");

        System.out.println("-------------------");

        int indian_score2 = 3000;
        int pakistan_score2 = 290;
        System.out.println(indian_score2 > pakistan_score2 ? "indian wins" : "pakistan wins");
        //************ 
         System.out.println("-----------------");

         int aº= 7*3+6/2-5;
         int bº= 21-8+aº%3*11;
        
         if(aº<bº)
          {
            System.out.println("a is less than b");
          }
         if(aº==bº)
          {
           System.out.println("a is equal "); 
          }
         if(aº>bº)
          {
            System.out.println("a is greater than b");
          } 

    } 
}
