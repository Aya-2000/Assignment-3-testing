package assignment1;

public class Physicist {

    public Boolean Coordinates(int n, int[][] arr) {


        int x = 0, y = 0, z = 0;
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] >= -100 && arr[i][j] <= 100) {


                        x += arr[i][0];
                        y += arr[i][1];
                        z += arr[i][2];

                    }
                    else {
                        System.out.println("coordinates must be between -100 & 100");

                        return false;
                    }
                }

            }

            if (x == 0 && y == 0 && z == 0) {


                System.out.println("Yes");

                return true;

            }
            else {
                System.out.println("No");

                return false;

            }
        } else {

            System.out.println("1<=n<=100");

            return false;

        }


    }
}

