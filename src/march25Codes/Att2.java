package march25Codes;
import java.util.Arrays;
public class Att2 {
    private String students[];
    private int studentId[];
    private int weekly[][];
    final String days[] = {"Mon", "Tue", "Wed", "Thu", "Fri"};

    public Att2(String students[], int studentId[]) {
        this.students = students;
        this.studentId = studentId;
        int[][] weeklyEmpty = new int[5][students.length];
        this.weekly = weeklyEmpty;
    }

    public String[] getStudents() {
        return this.students;
    }

    public int[] getStudentId() {
        return this.studentId;
    }

    public int[][] getWeekly() {
        return this.weekly;
    }

    public void enterAttendanceToday(String today) {
        if (today.equalsIgnoreCase("mon")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[0][i] = 1;
            }
        } else if (today.equalsIgnoreCase("tue")) {
            for (int i = 0; i < this.students.length; i++) {
                this.weekly[1][i] = 1;
            }
        }
    }

    public void printWeeklyAttendance() {
        System.out.print("\t\t");
        for (String student : this.students) {
            System.out.print(student + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < this.days.length; i++) {
            System.out.print(this.days[i] + "\t\t");
            for (int j = 0; j < this.students.length; j++) {
                if (this.weekly[i][j] == 0) {
                    System.out.print("Absent\t\t");
                } else {
                    System.out.print("Present\t\t");
                }
            }
            System.out.println();
        }
    }

    public void findMaxDay() {
        int[] daySum = new int[5];
        int count = 0;
        for (int i = 0; i < this.days.length; i++) {

            for (int j = 0; j < this.students.length; j++) {
                if (this.weekly[i][j] == 1) {
                    count++;
                }
            }
            daySum[i] = count;
        }
        System.out.println("weekly sums:");
        for (int i : daySum) {
            System.out.println(i);
        }
        int max = 0;
        int index=0;
        for (int i = 0; i < daySum.length; i++) {
            if (daySum[i] > max) {
                max = daySum[i];
                index=i;

            }
        }
        System.out.println("max:" + max+"day:"+index);
    }

//    public void max() {
//        int count = 0;
//        int num=0;
//        for (int i = 0; i < this.days.length; i++) {
//            System.out.print(this.days[i] + "\t\t");
//            for (int j = 0; j < this.students.length; j++) {
//                if (this.weekly[i][j] == 1) {
//                    count++;
//                }

//            }
//        }
//    }

        @Override
        public String toString () {
            return "Attendance{" +
                    "students=" + Arrays.toString(students) +
                    ", studentId=" + Arrays.toString(studentId) +
                    ", weekly=" + Arrays.toString(weekly) +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }
