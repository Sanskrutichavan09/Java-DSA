public class timespace {

    public static void main(String[] args) {
//  Q1. Identify the Time and Space Complexity
// public void printNumbers(int[] arr) {
//     for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i]);
//     }
// }
// Task:
// 1.	What is the time complexity? ans = O(n)
// 2.	What is the space complexity? ans =0(1)
System.out.println("__________________________________________________-");

// ✅ Q2. Analyze Nested Loops
// public void printPairs(int[] arr) {
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr.length; j++) {
//             System.out.println(arr[i] + ", " + arr[j]);
//         }
//     }
// }
// 👉 Task:
// 1.	Calculate the time complexity? ans 	O(n²)
// 2.	Is there any extra space used? ans 	 O(1)
System.out.println("__________________________________________________-");


// ✅ Q3. Recursion Space Complexity
// public int sum(int n) {
//     if (n == 0) return 0;
//     return n + sum(n - 1);
// }
// 👉 Task:
// 1.	What is the time complexity? ans  O(n)
// 2.	What is the space complexity?  ans O(n)
// (Think about how many times it calls itself)
System.out.println("__________________________________________________-");

// ✅ Q4. Best, Worst, Average Case
// public int search(int[] arr, int key) {
//     for (int i = 0; i < arr.length; i++) {
//         if (arr[i] == key) return i;
//     }
//     return -1;
// }
// 👉 Task:
// 1.	What is the best case time complexity?
// Best case: the key is found at the first index (i = 0)
// Only 1 comparison is made
// 👉 Best Case = O(1)


// 2.	What is the worst case time complexity?
// 2. Worst Case Time Complexity
// Worst case: the key is not in the array or is at the last index

// All n elements are checked

// 👉 Worst Case = O(n)

// 3.	What is the average case time complexity?

// On average, the key is somewhere in the middle of the array

// Around n/2 comparisons are made

// 👉 Average Case = O(n)

// ✅ Q5. Sorting Complexity Challenge
// 👉 You are using Bubble Sort to sort an array.
// 1.	What is the best case time complexity of Bubble Sort?
// / 1. Best Case Time Complexity
// Best case occurs when the array is already sorted.
// Best Case = O(n) (with optimization)
// 👉 Without optimization: O(n²)
// If the algorithm is optimized with a swapped flag to stop early:



// 2.	What is the worst case time complexity of Bubble Sort?
// Worst case: the array is sorted in reverse order.

// Every pair of elements must be compared and swapped.

// 👉 Worst Case = O(n²)

// 3.	What is the space complexity?

// Bubble Sort is an in-place sorting algorithm.

// It uses only a few variables for swapping and iteration.

// 👉 Space Complexity = O(1)


    }
    
}
