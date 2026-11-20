import java.util.Arrays;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != head && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;

            } else {
                current = current.next;
            }
        }
        return head;
    }


    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                k++;
            }
        }

        int slow = 0;
        int tmp;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;

            }
        }
        return k;

    }


    public int heightChecker(int[] heights) {
        int counter = 0;
        int[] copy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copy);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) {
                counter++;
            }
        }
        return counter;
    }

    public int[] plusOne(int[] digits) {
        int lastDigit = digits.length - 1;
        int increment = digits[lastDigit];
        increment++;
        if (increment >= 10) {
            int[] copy = Arrays.copyOf(digits, digits.length + 1);
            while (increment != 0) {
                digits[lastDigit-1] = increment % 10;
                increment /= 10;
                lastDigit--;
            }
            return copy;
        } else {
            while (increment != 0) {
                digits[lastDigit-1] = increment % 10;
                increment /= 10;
                lastDigit--;
            }
            return digits;
        }

    }


}
