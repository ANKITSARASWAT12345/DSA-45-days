//print the ceiling on  the left side of the array


/*import java.util.TreeSet;


class Main{
    public static void main(String[] args) {
        int arr[]={2,8,30,15,25,12};

        int n=arr.length;

        printCeiling(arr,n);
    }
    public static void printCeiling(int arr[], int n){
        System.out.print(-1+" ");
        TreeSet<Integer> st=new TreeSet<>();

        for(int i=1;i<n;i++){
            if(st.ceiling(arr[i])!=null){
                System.out.print(st.ceiling(arr[i])+" ");
            }
            else{
                System.out.print(-1+" ");
            }
            st.add(arr[i]);
        }
    }
}*/


//find the kth Largest element in the BST


class Node{
    int data;
    Node left,right;
    int leftCount;
    Node(int x){
        data=x;
        left= right=null;
        leftCount=0;
    }
}

class Main{

    public static Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        if(x<root.data){
            root.left=insert(root.left,x);
            root.leftCount++;
        }
        else if(x>root.data){
            root.right=insert(root.right,x);

        }
        return root;
    }

    public static Node kthSmallesNode(Node root,int k){
        if(root==null){
            return null;
        }

        int count=root.leftCount+1;

        if(count==k){
            return root;
        }
        if(count>k){
            return kthSmallesNode(root.left, k);
        }
        return kthSmallesNode(root.right, k-count);
    }


    public static void main(String[] args) {
        int keys[]={20,8,22,4,12,10,14};

        Node root=null;

        for(int x:keys){
          root=insert(root,x);
        }
        int k=4;
        Node res=kthSmallesNode(root,k);
        if (res == null)
            System.out.println("There are less "
                           + "than k node in the BST");
        else
            System.out.println("K-th Smallest" + " Elemement is "+res.data);
    }
}