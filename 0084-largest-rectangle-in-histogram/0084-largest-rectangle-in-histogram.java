class Solution {
    
    public int largestRectangleArea(int[] arr) {
        
        int maxA = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];

        //?? next smallest right ->
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        //?? next smallest left ->
        stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        //?? current area ->
        for (int i = 0; i < arr.length; i++) {
            int h = arr[i];
            int w = nsr[i] - nsl[i] - 1;
            int area = h * w;
            maxA = Math.max(area, maxA);
        }

        return maxA;
    }
}



