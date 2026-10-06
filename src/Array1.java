public class Array1 {
    // PASSING ARRAY TO A METHOD in single dimension
static void arr(int []a)
{
    for(int i:a)
    {
    System.out.print(i+" ");}
}

// passing array in method in two dimension
    public void meth(int [][]two)
    {
        for(int i= 0;i<two.length;i++)
        {
            for(int j = 0;j<two[i].length;j++)
            {
                System.out.print(two[i][j]+"  ");
            }
            System.out.println();
        }
    }

    //ANONYOMOUS ARRAY
    static void anon(int[]q)
    {
        for(int i:q)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
Array1 o = new Array1();

        // ONE / SINGLE DIMENSIONAL ARRAY
        int []a = {22,33,44,11};
        arr(a);
        System.out.println();
        System.out.println(a[2]);

        // ACCESSING ARRAY USING FOR EACH LOOP
        for(int i :a)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        int []b = new int[4];
        b[0] = 30;
        b[1]  = 8;
        b[2] = 44;
        b[3] = 99;
        System.out.println(b[1]);
        for(int i = 0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        // TWO DIMENSIONAL ARRAY
        int [][] two = new int [2][3];
        two[0][0] = 93;
        two[0][1] = 91;
        two[0][2] = 97;
        two[1][0] = 98;
        two[1][1] = 90;
        two[1][2] = 99;
        System.out.println();
        System.out.println(two[1][1]);

        o.meth(two);


        // two.length show length of row
        // two[i].length show i = 0 , row me kitne column h length
        // i = row , j = column
        for(int i = 0;i<two.length;i++)
        {
            for(int j = 0;j<two[i].length;j++)
            {
                System.out.print(two[i][j]+" ");
            }
            System.out.println();
        }

        int [][] t = {
                {2,3},
                {4,5},
                {6,7}
        };
//        System.out.println(t[2][1]);

        // ANONYMOUS
        anon(new int[]{2,1,3,4});

    }
}
