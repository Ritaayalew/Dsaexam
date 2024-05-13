package question2;
public class stack {
    class Stack {
        private int[] arr;
        private int top;
        private int capacity;
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }
        public void push(int x) {
            if (isFull()) {
                System.out.println("the stack is full ");
            }
            else{
            arr[++top] = x;
        }}


        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
            }
            else{
            return arr[top--];
        }}

        public int getSize() {
            return top + 1;
        }
        public boolean isEmpty() {
            return top == -1;
        }
        public boolean isFull() {
            return top == capacity - 1;
        }

        public void showStack() {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

    }
