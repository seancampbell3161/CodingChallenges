import java.util.ArrayList;

public class SnailSort {

    public static int[] snail(int[][] array) {

        ArrayList<Integer> tempArray = new ArrayList<>();

        // int row = array.length
        // int column = array[0].length

        int m = array.length;
        int n = array.length;
        String direction = "right";
        int iMin = 0;
        int iMax = m - 1;
        int jMin = 0;
        int jMax = n - 1;
        int i = iMin;
        int j = jMin;
        boolean done = false;

        if(array[0].length == 0) return new int[0];

        while(!done) {

            switch(direction) {

                case "right":
                    i = iMin;
                    j = jMin;
                    for(j = jMin; j <= jMax; j++) {
                        tempArray.add(array[i][j]);
                    }
                    direction = "down";
                    iMin++;
                    break;

                case "left":
                    i = iMax;
                    j = jMax;
                    for (j = jMax; j >= jMin; j--)
                        tempArray.add(array[i][j]);
                    direction = "up";
                    iMax--;
                    break;

                case "down":
                    i = iMin;
                    j = jMax;
                    for (i = iMin; i <= iMax; i++)
                        tempArray.add(array[i][j]);
                    direction = "left";
                    jMax--;
                    break;

                case "up":
                    i = iMax;
                    j = jMin;
                    for (i = iMax; i >= iMin; i--)
                        tempArray.add(array[i][j]);
                    direction = "right";
                    jMin++;
                    break;
            }

            if (iMin > iMax || jMin > jMax) done = true;

        }

        int[] results = new int[tempArray.size()];

        for(int k = 0; k < results.length; k++) {
            results[k] = tempArray.get(k);
        }

        return results;
    }
}
