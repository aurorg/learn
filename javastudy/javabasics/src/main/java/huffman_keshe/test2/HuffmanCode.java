package huffman_keshe.test2;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class HuffmanCode {
    public static void main(String[] args) {

        String content = "i like like like java do you like a java";
        byte[] contentBytes = content.getBytes();
        System.out.println(contentBytes.length);//40


        List<Node> nodes =getNodes(contentBytes);
        System.out.println(nodes);

        //测试创建的二叉树
        System.out.println("哈弗曼树");
        Node huffmanTreeRoot =createHuffmanTree(nodes);
        System.out.println("前序遍历");
        huffmanTreeRoot.preOrder();
    }

    //前序遍历的方法
    private static void preOrder(Node root){
        if(root!=null){
            root.preOrder();
        }else{
            System.out.println("空的");
        }
    }


    /**
     *
     * @param bytes 接收字节数组
     * @return 返回的是list形式，【Node{data='97,weight=5}】
     */
    private static List<Node> getNodes(byte[] bytes) {

        //1.创建一个ArrayList
        ArrayList<Node> nodes = new ArrayList<Node>();

        //2.遍历bytes 统计每一个byte出现的次数，用map比较方便。 map[key,value]
        Map<Byte, Integer> counts = new HashMap<>();  //byte存的是数据，integer存储的是字符出现的次数
        for (byte b : bytes) {
            Integer count = counts.get(b); //获取byte（也就是字符）
            if (count == null) {//Map中还没有这个字符数据，第一次放入
                counts.put(b, 1);
            } else {
                counts.put(b, count+1);
            }
        }
        //把每个键值对转成一个Node对象，并且加入到nodes集合
        //遍历map
        for(Map.Entry<Byte,Integer> entry: counts.entrySet()){
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }
        return nodes;
    }

    //通过list创建对应的哈弗曼树
    private static Node createHuffmanTree(List<Node> nodes){
        while(nodes.size()>1){
            //排序，从小到大
            Collections.sort(nodes);

            //取出第一颗最小的二叉树
            Node leftNode =nodes.get(0);

            //取出第二颗最小的二叉树
            Node rightNode =nodes.get(1);

            //创建一颗新的二叉树，它的根结点没有data，只有取值
            Node parent=new Node(null, leftNode.weight + rightNode.weight);
            parent.left=leftNode;
            parent.right=rightNode;

            //将已经处理过的两颗二叉树从nodes中移除
            nodes.remove(leftNode);
            nodes.remove(rightNode);

            //将新的二叉树加入到nodes
            nodes.add(parent);
        }
        //nodes最后的结点，就是哈弗曼树的根结点
        return nodes.get(0);
    }
}


//创建Node,含有数据和权值
class Node implements Comparable<Node> {
    Byte data; //存放数据本身（字符），比如‘a’存的就是97
    int weight; //权值，表示每一个字符出现的次数
    Node left;
    Node right;

    public Node(Byte data, int weight) { //构造器
        this.data = data;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        //从小到大排序
        return this.weight - o.weight;
    }

    @Override //方便打印
    public String toString() {
        return "Node{" + "data=" + data + ", weight=" + weight + '}';
    }

    //前序遍历
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}