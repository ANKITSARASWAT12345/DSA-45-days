//Array Implementation of stack
//pros- Easy to implement and save memory as pointers are not involved;
//cons- it is not Dyanamic, we can not grow or srink the array at run time



/*class Stack{
    static final int MAX=1000;

    int top;
    int a[]=new int[MAX];

    boolean isEmpty(){
       
        return (top<0);
    }

    Stack(){
        top=-1;
    }

    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("stack overflow");
            return false;
        }
        a[++top]=x;
        System.out.println("element pushed into the stack");
        return true;
    }

    int pop(){
        if(top<0){
            System.out.println("stack under flow occured");
            return 0;
        }
        int ele=a[top--];
        return ele;
    }

    int peek(){
        return a[top];
    }


}

public class Main {
    
    public static void main(String[] args) {
        Stack obj=new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());


    }
}*/


//Linkedlist implementation of the stack




public class Main{

 StackasLinkedlist root;
 
    class StackasLinkedlist{

        int data;
        StackasLinkedlist next;

        StackasLinkedlist(int data){
            this.data=data;
        }

    }

    public void push(int x){
        StackasLinkedlist newNode=new StackasLinkedlist(x);

        if(root==null){
           root=newNode;
        }
        newNode.next=root;
        root=newNode;
    
        System.out.println("element pushed into stack");
    }

    public boolean isEmpty(){
        if(root==null){
            return true;
        }
        return false;
    }

    public int pop(){
        if(root==null){
            System.out.println("stack is empty");
        }

        int popEle=root.data;
        root=root.next;
        return popEle;
    }



    public static void main(String[] args) {
      Main obj=new Main();
      obj.push(1);
      obj.push(2);
      obj.push(3);
      System.out.println(obj.pop());
      System.out.println(obj.pop());
      System.out.println(obj.pop());
      System.out.println(obj.pop());
      System.out.println(obj.isEmpty());
    }
}
