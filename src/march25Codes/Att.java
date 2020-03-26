package march25Codes;

import java.util.Arrays;

public class Att {
    String[] studentsNames;
    int[] studentsIDs;
    int[][] weeklyCheck;
    String[] daysOfWeek;
    final String[] days = {"M", "T", "W", "Th", "F"};

    public Att(String[] studentsNames, int[] studentsIDs) {
        this.studentsNames = studentsNames;
        this.studentsIDs = studentsIDs;
        int[][] weeklyEmpty = new int[5][this.studentsNames.length];
        this.weeklyCheck = weeklyEmpty;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "studentsNames=" + Arrays.toString(studentsNames) +
                ", studentsIDs=" + Arrays.toString(studentsIDs) +
                ", weeklyCheck=" + Arrays.toString(weeklyCheck) +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    public void enterAttandanceToday(String today) {
        if (today.equalsIgnoreCase("monday")) {
            for (int i = 0; i < this.studentsNames.length; i++) {
                this.weeklyCheck[0][i] = 1;
            }

        }

    }
    public void printWeeklyAttandance(){

        System.out.print("\t\t\t");
        for(String student:this.studentsNames){
            System.out.print(student+"\t\t");
        }
        System.out.println();

        for(int i=0; i<this.days.length; i++){
            System.out.print(this.days[i]+"\t");
            for(int j=0; j<this.studentsNames.length; j++){
                System.out.print(this.weeklyCheck[i][j]+"\t\t");
            if(this.weeklyCheck[i][j]==0){
                System.out.print("absent");
            }
            }
            System.out.println();
        }
    }
}
//    public void checkWeekly(){
//
//            for(String j:days){
//                System.out.print(j+"\t");
//                for(String i:this.studentsNames){
//                    System.out.print(i+"\t");
//            }
//            System.out.println();
//        }
//    }
//
//            }
//
