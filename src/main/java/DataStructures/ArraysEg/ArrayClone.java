package DataStructures.ArraysEg;

public class ArrayClone {

    public static void main(String[] args) {
        //CLoning of array

        int intArrayC[] = { 1, 2, 3 };

        //here deep copy is created for cloned array so new address is being assigned for Single dimensional array
        int cloneArray[] = intArrayC.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArrayC == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }

//        A clone of a multi-dimensional array (like Object[][]) is a “shallow copy
        int intArrayMD[][] = { { 1, 2, 3 }, { 4, 5 } };

        int cloneArrayMD[][] = intArrayMD.clone();

        // will print false
        System.out.println(intArrayMD == cloneArrayMD);

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArrayMD[0] == cloneArrayMD[0]);
        System.out.println(intArrayMD[1] == cloneArrayMD[1]);

    }
}
