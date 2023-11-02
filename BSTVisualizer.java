import javax.swing.*;
import java.awt.*;

class BSTVisualizer extends JPanel{
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, root, getWidth() / 2, 50, getWidth() / 4);
    }

    private void drawTree(Graphics g, TreeNode node, int x, int y, int xOffset) {
        if (node != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(2)); // Set thicker stroke here
            g.setColor(new Color(238,252,94));
            int circleRadius = 20; // Radius of the circle
            int circleDiameter = circleRadius * 2; // Diameter of the circle
            int startX = x; // Starting X-coordinate of the line
            int startY = y + circleRadius; // Starting Y-coordinate of the line (adjusted for circle's circumference)
            g.fillOval(x - circleRadius, y - circleRadius, circleDiameter, circleDiameter);
            g.setColor(Color.BLACK);
            g.drawOval(x - circleRadius, y - circleRadius, circleDiameter, circleDiameter);
            g.drawString(Integer.toString(node.val), x - 5, y + 5);
            if (node.left != null) {
                int endX = x - xOffset; // Ending X-coordinate of the line
                int endY = y + 50; // Ending Y-coordinate of the line
                g.drawLine(startX, startY, endX, endY);
                drawTree(g, node.left, endX, endY, xOffset / 2);
            }
            if (node.right != null) {
                int endX = x + xOffset; // Ending X-coordinate of the line
                int endY = y + 50; // Ending Y-coordinate of the line
                g.drawLine(startX, startY, endX, endY);
                drawTree(g, node.right, endX, endY, xOffset / 2);
            }
        }

        
    }
}
