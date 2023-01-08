package src.pg.최대값인덱스구하기;

import java.util.*;

public class 최대값인덱스구하기 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = scanner.nextInt();
        List<Integer> answerList = new ArrayList<>();

        // logic
        int[] copyArr = new int[N];
        for (int i = 0; i < N; i++)
            copyArr[i] = arr[i];


        Arrays.sort(arr);
        int maxNum = arr[arr.length - 1];

        for (int i = 0; i < copyArr.length; i++) {
            if (copyArr[i] == maxNum) {
                answerList.add(i);
            }
        }

        // output
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
