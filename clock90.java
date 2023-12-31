public class clock90 {
    public static void main(String[] args) {
        int arr[][]={
            { 1, 2, 3, 4},
            { 5, 6, 7, 8},
            { 9, 10, 11, 12},
            { 13, 14, 15, 16}
        };

        // Rotate the matrix 90 degrees
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        // Print the rotated and reversed matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
