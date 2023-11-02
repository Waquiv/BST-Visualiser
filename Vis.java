import java.awt.Color;
import java.util.Scanner;
import javax.swing.*;


public class Vis {

    private static void displayBST(TreeNode node){
        // Create a JFrame to display the BST
        JFrame frame = new JFrame("BST Visualization");
        BSTVisualizer visualizer = new BSTVisualizer();
        visualizer.setRoot(node);
        visualizer.setBackground(Color.WHITE);
        ImageIcon image = new ImageIcon("Icon.png");
        frame.setIconImage(image.getImage());
        frame.add(visualizer);
        frame.setTitle("BST Graph");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    private static int start(){
        Scanner sc=new Scanner(System.in);
        boolean check=true;
        int choice, num=0;
        System.out.println("*************************************************");
        System.out.println("*******THIS IS A BST VISUALIZATION PROGRAM*******");
        System.out.println("**refer to the .txt for more information**");
        System.out.println("*************************************************");

        while(check){
            System.out.println("Enter the number to select options:-");
            System.out.println("1) Create new BST\n2) EXIT");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter the value of the root node:");
                num=sc.nextInt();
                if(num==0){
                    System.out.println("Root node cannot be 0");
                }
                else{check=false;}
            }
            else if(choice==2){
                System.exit(0);
            }
            else{System.out.println("\033c");System.out.println("!!Please select a valid option!!");}
        }
        return num;
    }
    // feature: insert multiple/clear console  
    public static void main(String[] args) {
        
        BST bt=new BST();
        boolean menu=true;
        int num, temp;
        Scanner sc =new Scanner(System.in);
        TreeNode root=bt.createNewNode(start());

        while(menu){
            System.out.println("Enter a number to select an option:");
            System.out.println("1) insert node(single)\n2) insert node(multiple)\n3) delete node");
            System.out.println("4) show BST\n5) search node\n6) EXIT");
            num=sc.nextInt();
            
            switch (num) {
                case 1:
                    System.out.println("\033c");
                    System.out.println("Enter the value of the node");
                    temp=sc.nextInt();
                    bt.insertNode(root, temp);
                    break;

                case 2:
                    System.out.println("\033c");
                    System.out.println("Enter the number of nodes to be inserted:");
                    temp=sc.nextInt();
                    System.out.println("Enter the values:");
                    for(int i=temp; i>0; i--){
                        int val=sc.nextInt();
                        bt.insertNode(root, val);
                    }
                    break;

                case 3:
                    System.out.println("\033c");
                    System.out.println("Enter the value of the node to be deleted:");
                    temp=sc.nextInt();
                    bt.deleteNode(root, temp);
                    break;

                case 4:
                    System.out.println("\033c");
                    displayBST(root);
                    break;

                case 5:
                    System.out.println("\033c");
                    System.out.println("Enter the value of node to be searched:");
                    temp=sc.nextInt();
                    TreeNode clone=bt.clone(root);
                    bt.searchDraw(clone, temp);
                    displayBST(clone);
                    break;

                case 6:
                    System.out.println("\033c");
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("\033c");
                    System.out.println("!! Invalid option press 0 to continue !!");
                    temp=sc.nextInt();
                    break;
            }
        }

    }
}
