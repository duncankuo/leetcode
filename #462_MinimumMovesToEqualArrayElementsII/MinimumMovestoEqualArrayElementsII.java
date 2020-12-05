import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MinimumMovestoEqualArrayElementsII {



    public int minMoves2(int[] nums) {
        int result = 0;

        Arrays.sort(nums);
        int mid_index = nums.length / 2;
        int target = nums[mid_index];

        for (int index = 0; index < nums.length; index++) {
            result += (index <= mid_index ? target - nums[index] : nums[index] - target);
        }

        return result;
    }


    public static void main(String[] args) {
        MinimumMovestoEqualArrayElementsII action = new MinimumMovestoEqualArrayElementsII();

        int[] test1 = {1,2,3};
        int result1 = 2;
        System.out.println(result1 == action.minMoves2(test1));

        int[] test2 = {1,0,0,8,6};
        int result2 = 14;
        System.out.println(result2 == action.minMoves2(test2));

        int[] test3 = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        int result3 = 2127271182;
        System.out.println(result3 == action.minMoves2(test3));

        int[] test4 = {-425653504,-349566234,-250908656,-212123143,48321315,50986744,66379082,203125577,230332704,386516853};
        int result4 = 2127271182;
        System.out.println(result4 == action.minMoves2(test4));

        int[] test5 = {-7615376,7065767,-30721502,-19896790,5612685,39535964,-28332744,-34825120,-20172334,20503934,-16199657,-34307308,-6071378,-27835828,-9937876,42289534,-38232842,-20048091,-41335036,7821723,-34432687,-41289744,-6009854,-18287348,-16529745,22966834,-36025511,-17681789,-7328936,-24486358,8473552,-4012820,12532319,-19520114,-42675015,-22563687,5898339,-19792526,-18667547,29737653,4256053,40738294,4192736,-13456716,19165257,-3114524,1812666,-32700329,-11045955,-42878398,42913398,32171554,-35468192,36350643,7024999,-23676354,-36766741,11476115,26064512,24272680,30855422,22997937,-28711943,883031,38015942,8971606,22085278,31960328,2003730,-31120158,-28497464,35907947,-24312257,-20653835,22875253,-18354614,-29555971,13035117,-30088475,-42014807,38866755,25241564,39063323,-38428372,14361223,-11603067,-8123101,-14265425,-5158953,-28792390,5251891,24504379,19856404,-5904515,-15326481,37288598,-29579356,-14403264,-18041711,-34734244};
        int result5 = 2138083402;
        System.out.println(result5 == action.minMoves2(test5));
    }
}
