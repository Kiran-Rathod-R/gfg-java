class Solution {
  public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        int n = arr.size();
        long long current_sum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            // Add the current element to the window
            current_sum += arr[end];

            // If current_sum exceeds target, shrink the window from the left
            while (current_sum > target && start < end) {
                current_sum -= arr[start];
                start++;
            }

            // Check if we found the target sum
            if (current_sum == target) {
                // Return 1-based indices
                return {start + 1, end + 1};
            }
        }

        // No subarray found
        return {-1};
    }
};