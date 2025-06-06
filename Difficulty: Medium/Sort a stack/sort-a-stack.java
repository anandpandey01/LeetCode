//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop(); // Remove top element
            sort(s); // Sort the remaining stack
            insertSorted(s, temp); // Insert the element at the correct position
        }
        return s;
    }

    // Helper function to insert an element into a sorted stack
    private void insertSorted(Stack<Integer> s, int temp) {
        if (s.isEmpty() || s.peek() <= temp) {
            s.push(temp); // If empty or correct position found, push temp
            return;
        }
        
        int top = s.pop(); // Remove the top element
        insertSorted(s, temp); // Recursively insert temp
        s.push(top); // Push the popped element back
    
    }
}