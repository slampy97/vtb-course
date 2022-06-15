public class SumCounting {
    public static int count(String[][] myArray) throws MyArraySizeException, MyArrayStoreException {
        if (myArray.length != 4) {
            throw new MyArraySizeException();
        }

        if (myArray[0].length != 4) {
            throw new MyArraySizeException();
        }

        int finalSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    finalSum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayStoreException();
                }
            }
        }
        return finalSum;
    }
}
