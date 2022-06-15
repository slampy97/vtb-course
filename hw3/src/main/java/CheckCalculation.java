public class CheckCalculation {
    public static void main(String[] arg) {
        String[][] arrays = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrays[i][j] = Integer.valueOf(i + j).toString();
            }
        }
        System.out.println(SumCounting.count(arrays));

        String[][] arrays2 = new String[5][5];
        try {
            System.out.println(SumCounting.count(arrays2));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        String[][] arrays3 = new String[4][4];
        arrays3[0][0] = new Object().toString();
        try {
            System.out.println(SumCounting.count(arrays3));
        } catch (MyArrayStoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
