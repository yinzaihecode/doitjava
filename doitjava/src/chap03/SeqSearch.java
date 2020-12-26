package chap03;

import java.util.Scanner;

public class SeqSearch {

    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "x[");
            x[i] = sc.nextInt(num); // 요솟수가 입력받은 수(num)인 배열!

        }
        System.out.print("검색할 값"); // 키 값 입력
        int ky = sc.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("값의 요소가 없습니다.");
        else
            System.out.println(ky + "은 " + idx + "에 있습니다.");
    }
}

