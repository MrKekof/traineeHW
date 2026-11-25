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
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int [] newDigits = new int[digits.length+1];
            for (int i = newDigits.length - 1; i <= 0; i--) {
                newDigits[i] = 0;
            }
            newDigits[0] = 1;
            return newDigits;
        }
    }
    public int lengthOfLastWord(String s) {
        int wordCounter=0;
        for ( int i = s.length() ;i>=0; i-- ){
            if ( s.charAt(i)!=' '){
                wordCounter++;
            }
            if (s.charAt(i)==' '){
                break;
            }
        }
        return wordCounter;
    }
}
