import java.sql.SQLOutput;

public class JaggedArray {
    public static void main(String[] args) {

        //IN JAVA JAGGED ARRAY IS A 2D ARRAY WHERE NOT SAME NO. OF COLUMNS / ELEMENTS IN ALL ROWS

        int [][] n = {
                {2,3},
                {3,4,5},
                {11,22,33,44}
        };
        System.out.println(n[1][0]);
        for(int[] i : n)
        {
            System.out.print(i);
        }


        int [][] arr = new int[4][];
        arr [0]  =  new int[1];
        arr [1]  =  new int[2];
        arr [2]  =  new int[1];
        arr [3]  =  new int[3];

        arr[0][0] = 21;

        arr[1][0] = 31;
        arr[1][1] = 21;

        arr[2][0] = 21;

        arr[3][0] = 31;
        arr[3][1] = 21;
        arr[3][2] = 21;

        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




    }
}
