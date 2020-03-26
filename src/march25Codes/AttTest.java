package march25Codes;

public class AttTest {

           public static void main(String[] args) {
            String [] students={"A", "B", "C", "D", "E"};
            int [] ids={1,2,3,4,5};
            Att myAtt=new Att(students,ids);
            System.out.println(myAtt);
myAtt.printWeeklyAttandance();
        }
    }

