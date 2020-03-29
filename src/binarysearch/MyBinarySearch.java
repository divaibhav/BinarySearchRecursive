/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Mar-20
 *  Time: 1:26 AM
 */
package binarysearch;

public class MyBinarySearch {
    private int[] arr;

    public MyBinarySearch(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70};
        MyBinarySearch object = new MyBinarySearch(sortedArray);
        int searchElement = 65;
        boolean result = object.binarySearchRecursive(searchElement, 0, sortedArray.length - 1);
        if (result) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    public boolean binarySearchRecursive(int searchElement, int low, int high) {
        boolean response = false;
        if (low <= high) {
            int mid = (low + high) / 2;
            if (searchElement == arr[mid]) {
                response = true;
            } else if (searchElement < arr[mid]) {
                response = binarySearchRecursive(searchElement, low, mid - 1);
            } else {
                response = binarySearchRecursive(searchElement, mid + 1, high);
            }
        }
        return response;
    }

}
