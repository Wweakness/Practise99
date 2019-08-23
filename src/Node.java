import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//二叉树的遍历
public class Node {
    int val;
    Node right=null;
    Node left=null;
    Node(int val){
        this.val=val;
    }
    //打印前序遍历
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    //中序遍历
    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);

    }
    //后序遍历
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }
    public static Node creact(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        d.left=null;d.right=null;
        e.left=null;e.right=null;
        c.left=null;c.right=f;
        f.left=null;f.right=null;
        return a;
    }
    public static void main(String[] args){
        Node kk=creact();
        inOrderTraversal(kk);
        System.out.println("==============");
        Node gg=creact();
        preOrderTraversal(gg);
        System.out.println("==============");
        Node mm=creact();
        postOrderTraversal(mm);
        System.out.println("==============");
        Node oo=creact();
        System.out.println(preOrder(oo));

    }
    //返回前序遍历

    public static List<Integer> preOrder(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        List<Integer> leftPreOrder=preOrder(root.left);
        List<Integer> rightPreOrder=preOrder(root.left);

        list.add(root.val);
        list.addAll(leftPreOrder);
        list.addAll(rightPreOrder);
        return list;

    }
}

