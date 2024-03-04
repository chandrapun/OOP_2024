public class StudentGradesTable {
    public static void main(String[] args) {
        // Student 1
        String name1 = "Chandra";
        int labPoints1 = 43;
        int bonusPoints1 = 7;

        // Student 2
        String name2 = "William";
        int labPoints2 = 50;
        int bonusPoints2 = 8;

        // Student 3
        String name3 = "Mary Sue";
        int labPoints3 = 39;
        int bonusPoints3 = 10;

        // Student 4
        String name4 = "John";
        int labPoints4 = 48;
        int bonusPoints4 = 6;

        // Student 5
        String name5 = "Emily";
        int labPoints5 = 45;
        int bonusPoints5 = 9;

        // Print table header
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t\tStudent Points\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

        // Print column headers
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");

        // Print student data for each student
        printStudentData(name1, labPoints1, bonusPoints1);
        printStudentData(name2, labPoints2, bonusPoints2);
        printStudentData(name3, labPoints3, bonusPoints3);
        printStudentData(name4, labPoints4, bonusPoints4);
        printStudentData(name5, labPoints5, bonusPoints5);
    }

    // Method to print student data
    public static void printStudentData(String name, int labPoints, int bonusPoints) {
        System.out.println(name + "\t\t" + labPoints + "\t" + bonusPoints + "\t" + (labPoints + bonusPoints));
    }
}
