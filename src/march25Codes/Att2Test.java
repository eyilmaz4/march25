package march25Codes;

public class Att2Test {
    public static void main(String[] args) {
        String [] students={"A", "B", "C", "D", "E"};
        int [] ids={1,2,3,4,5};
        Att2 myAtt2=new Att2(students,ids);
        System.out.println(myAtt2);



        myAtt2.enterAttendanceToday("mon");
        myAtt2.getWeekly();
        myAtt2.printWeeklyAttendance();
        myAtt2.findMaxDay();


    }
}
