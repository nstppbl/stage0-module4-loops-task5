package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int i, j;
        for (i = 1; i <= length; i++)
        {
            for (j = 1; j <= height; j++)
            {
                if (i == 1 || i == length ||
                        j == 1 || j == height)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
