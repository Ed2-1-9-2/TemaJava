public class Main {
    public static void main(String[] args) {
        SolutionofTwo_Sum solution = new SolutionofTwo_Sum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Exemplul 1 arata numerele potrivite pentru adunare: " + result1[0] + ", " + result1[1]);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Example 2 arata al doilea si al treilea numar ca fiind potrivite: " + result2[0] + ", " + result2[1]);

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Exemplul 3 este de regula evident: " + result3[0] + ", " + result3[1]); 
    }
}