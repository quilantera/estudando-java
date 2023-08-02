package aula28_07;

public class EstudoVetores {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(nums[4]);
        nums[3]= 8;
        System.out.println(nums[3]);
        for (int i= 0; i<nums.length; i++){
            System.out.print(nums[i]);
        }
        double[] notas = new double[60];
        notas[59]= 5.6;
        System.out.println(notas[59]);

    }
}
