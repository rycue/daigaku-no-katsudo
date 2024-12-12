#include <stdio.h>

int binarySearch(int arr[], int low, int high, int x) {
    while (low <= high) {
        int mid = low + (high - low) / 2;
        // check if x is present at mid
        if (arr[mid] == x) return mid;

        // if greater, ignore left half
        if (arr[mid] < x) low = mid + 1;

        // if x is smaller, ignore right half
        else
            high = mid - 1;
    }
    // if we reach here, then the element was not present
    return -1;
}

int main() {
    int arr[] = {2, 3, 4, 10, 40};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 10;
    int result = binarySearch(arr, 0, n - 1, x);
    if (result == -1)
        printf("Element is not present in array");
    else
        printf("Element is present at index %d", result);
    return 0;
}