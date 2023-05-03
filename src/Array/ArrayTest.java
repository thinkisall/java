package Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

        for(int i=0, num=1; i<arr.length; i++) {
            arr[i] = num++;
            System.out.println(arr[i]);
        }

        // forEach와 동일
        // num 변수에 arr요소를 하나씩 집어넣는 것.
        for(int num : arr) {
            total += num;
        }
        System.out.println(total);

        // 자바
    }
    
}
