package geekforgeeks;

public class RotateAndDelete {
    public static int[] arr;
    public static int n, cnt;
    public static int m;

    static void leftRotation(int x, int y) {
        int a = arr[x];
        for(int i=x; i<y; i++) {
            arr[i] = arr[i+1];
        }
        arr[y] = a;
    }

    static void rightRotation(int x, int y) {
        int a = arr[y];
        for(int i=y; i>x; i--) {
            arr[i] = arr[i-1];
        }
        arr[x] = a;
    }

    static void printArray() {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void intiateRotate() {
        cnt = 1;
        for(int i=0; i<n ;i++) {
            if(cnt<=n) {
                rightRotation(0,n-i-1);
                leftRotation(n-cnt, n-i-1);
            }
            else break;
            //printArray();
            cnt += 2;
        }
        System.out.println(arr[0]);
    }


}

