public class ControlFlowExercises {
    public static void main(String[] args) {
        // i
//        int i = 5;
//        while (i <= 15) { // continue as long as i is less than or equals to 15
//            System.out.println(i);
//            i++;
//        }
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        // ii
//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count <= 100);
        for (int count = 0; count <= 100; count += 2) {
            System.out.println(count);
        }
    }
}
