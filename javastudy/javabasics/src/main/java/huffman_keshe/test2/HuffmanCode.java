package huffman_keshe.test2;

import java.nio.charset.StandardCharsets;

public class HuffmanCode {
    public static void main(String[] args) {

        String content="i like like like java do you like a java";
        byte[] contentBytes =content.getBytes();
        System.out.println(contentBytes.length);//40
    }
}


//创建Node,含有数据和权值
class Node implements Comparable<Node>{
    Byte data; //存放数据本身（字符），比如‘a’存的就是97
    int weight; //权值，表示每一个字符出现的次数
    Node left;
    Node right;

    public Node(Byte data,int weight){ //构造器
        this.data=data;
        this.weight=weight;
    }

    @Override
    public int compareTo(Node o) {
        //从小到大排序
        return this.weight-o.weight;
    }

    @Override //方便打印
    public String toString() {
        return "Node{" + "data=" + data + ", weight=" + weight + '}';
    }

    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }
}