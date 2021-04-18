package problem.search.binary;

public class BinarySearchVariation {

    /**
     * 정렬된 배열에서 target의 시작 position과 종료 position 찾기
     * [1 2 3 4 5 5 5 5 5] => return [4, 8] 없을 경우
     */

    public int[] findStartAndEnd(int[] nums, int target) {
        int[] result = {nums.length - 1, 0};
        int mid;
        int left = 0;
        int right = nums.length - 1;

        while(right >= left) {
            mid = (right + left) / 2;

            if(target == nums[mid]) {
                if(result[0] > mid) {
                    result[0] = mid;
                }
                if(result[1] < mid) {
                    result[1] = mid;
                }
            }

            if(target < nums[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
