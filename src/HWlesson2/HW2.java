package HWlesson2;

public class HW2 {
    public static void main(String[] args){
        String [][] strArray = {{"12","5","17","28"},{"2","12","35","21"},{"22","15","47","38"},{"11","3","10","18"}};
        String [][] strArray2 = {{"12","8","5","17","28"},{"2","12","35","21"},{"22","15","47","38"},{"11","3","10","18"}};
        String [][] strArray3 = {{"6","5","17","28"},{"2","h","35","21"},{"22","15","47","38"},{"11","3","10","18"}};

        printArray(strArray);
        try {
            arraySum(strArray);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            arraySum(strArray2);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            arraySum(strArray3);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static void printArray(String[][] strArray){

        for (int i = 0; i < strArray.length; i++ ){
            for (int j = 0; j < strArray[i].length; j++){
                System.out.print(strArray[i][j] + "|");
            }
            System.out.println();
        }




    }

    static class MyArraySizeException extends Exception {
        public MyArraySizeException() {
            super("Ваш массив неподходящего размера, нужен 4х4");
        }
    }


    static class MyArrayDataException extends Exception {
        public MyArrayDataException(int i, int j) {
            super("Невозможно преобразовать элемент в ячейке " + i + " " + j);
        }

    }


    public static void arraySum(String[][] strArray) throws MyArrayDataException, MyArraySizeException {

        int sum = 0;
        int[][] numArray;

        if (strArray.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length != 4) {
                throw new MyArraySizeException();
            }
        }


        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < strArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(strArray[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        System.out.println("Сумма элементов массива = " + sum );
    }



    }





