package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int i, j;
        for (i = 1; i <= sideLength; i++)
        {
            for (j = 1; j <= sideLength; j++)
            {
                if( i==j || i - 1 == sideLength - j )
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
