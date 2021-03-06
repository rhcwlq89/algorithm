package problem.search.binary.breadth;

import java.util.LinkedList;
import java.util.Queue;

public class JumpOfFrog {
    /**
     * 개구리 한 마리가 일렬로 놓인 징검다리 위를 뛰어가려고 합니다. 이 개구리는 첫 번째 위치의 징검다리 위에서 시작하여 가장 마지막
     * 징검다리로 도달하기를 원하며, 각 징검다리 위에 쓰여 있는 숫자만큼만 징검다리를 건너뛸 수 있습니다. 각 징검다리에 쓰여 있는 숫자가
     * 담긴 배열이 입력으로 주어질 때, 개구리가 마지막 징검다리에 도착하기 위한 최소 점프 횟수를 반환하는 함수 solution을 완성해 주세요.
     * 만약 마지막 징검다리에 도착할 수 없다면 -1을 반환해 주세요.
     *
     * 제한사항
     * 징검다리의 개수는 100,000 이하의 자연수입니다.
     * 징검다리에 적힌 숫자는 0 이상 100 이하인 정수입니다.
     * 입출력 예
     * nums	result
     * [4, 1, 2, 3, 1, 0, 5]	3
     * 입출력 예 설명
     * 입출력 예 #1
     * 징검다리에 적힌 숫자는 [4, 1, 2, 3, 1, 0, 5]입니다.
     * 0 번째 징검다리에서 4칸을 뛰어 4번째 징검다리에 온 다음 ,
     * 4번째 징검다리에서 뒤쪽으로 한 칸 뛰어 3번째 징검다리로 간 후 ,
     * 앞쪽으로 3칸을 뛰어 마지막 징검다리에 도착할 수 있으며 최소 점프 횟수는 3입니다.
     */

    public int jumpOfFrog(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int count = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i =0; i < size; i++) {
                int currentPosition = queue.poll();
                int jump = nums[currentPosition];
                int leftPosition = currentPosition - jump;
                int rightPosition = currentPosition + jump;

                if(rightPosition == nums.length - 1) {
                    return count;
                }

                if(leftPosition != rightPosition) {
                    if ((leftPosition > 0) && (visited[leftPosition] == false)) {
                        queue.offer(leftPosition);
                        visited[leftPosition] = true;
                    }
                    if ((rightPosition < nums.length - 1) && (visited[rightPosition] == false)) {
                        queue.offer(rightPosition);
                        visited[rightPosition] = true;
                    }
                }
            }
            count ++;
        }

        return -1;
    }
}
