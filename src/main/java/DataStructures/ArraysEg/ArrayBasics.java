package DataStructures.ArraysEg;

public class ArrayBasics {

    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/arrays-in-java/
        System.out.println("Hii Array here");

        int intArray[];    //declaring array
        intArray = new int[20];  // allocating memory to array

        int[] intArray1 = new int[20]; // combining both statements in one

        //Array Literal -In a situation where the size of the array and variables of the array are already known, array literals can be used.

        int[] intArray2 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        // Declaring array literal

        Student objArray[]=new Student[5];

        for (int i = 0; i < objArray.length; i++) {
            Student s1=new Student();
            s1.setRollNo(i);
            s1.setName("a"+i);
            objArray[i]=s1;
            // arr[0] = new Student(1, "aman");
        }

        for (int i = 0; i < objArray.length; i++) {
            System.out.println(+objArray[i].getRollNo()+" - " +objArray[i].getName()+"");
        }


        //MULTI-Dimensional Array

        int[][] multiArr=new int[3][3];

        int count=1;

        for (int i = 0; i <multiArr.length ; i++) {
            for (int j = 0; j < multiArr[0].length; j++) {
                multiArr[i][j]=count;
                count++;
            }
        }

        for (int i = 0; i <multiArr.length ; i++) {
            for (int j = 0; j < multiArr[0].length; j++) {
                System.out.print(multiArr[i][j]);
            }
            System.out.println("");
        }

/*      int[] arr=new int[5];

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        String[] strArr=new String[5];

        strArr[0]="Lionel";
        strArr[1]="Messi";
        strArr[2]="is";
        strArr[3]="Best";
        strArr[4]="Football Player";

        for (int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }*/



    }
}
