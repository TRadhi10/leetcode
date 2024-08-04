class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    int count = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return count;
    }

    private int[] dfs(TreeNode node, int distance) {
        if (node == null) {
            return new int[0];
        }
        if (node.left == null && node.right == null) {
            return new int[]{0};
        }
        int[] leftDistances = dfs(node.left, distance);
        int[] rightDistances = dfs(node.right, distance);
        for (int leftDist : leftDistances) {
            for (int rightDist : rightDistances) {
                if (leftDist + rightDist + 2 <= distance) {
                    count++;
                }
            }
        }
        int[] distances = new int[leftDistances.length + rightDistances.length];
        int index = 0;
        for (int leftDist : leftDistances) {
            distances[index++] = leftDist + 1;
        }
        for (int rightDist : rightDistances) {
            distances[index++] = rightDist + 1;
        }
        return distances;
    }
public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int distance = 3;

        Solution solution = new Solution();
        int result = solution.countPairs(root, distance);

        System.out.println("Number of good leaf node pairs: " + result);
    }
}
