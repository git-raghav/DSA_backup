//selection sort m sabse chote element ko sabse agge swap krte h or 2nd smallest ko 2nd index p
public class _2_selectionSort {
    public static void ssort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {// ek kam chlte h total no. of elements se kyonki last element ko sort krne ki zaroorat nahi h
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {// i se ek aage se start krna h till last element
                if (arr[j] < arr[minPos]) {// compare
                    minPos = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 48, 0, 6, 1, 8, 4, 4, 4, -1 };
        ssort(arr);
    }
}
