package problem.search.binary.breadth;

import java.util.*;

public class CatchMole {

    public int solution(int n, int m, int[][] moles) {
        List<Mole> moleList = new ArrayList<>();
        for (int[] mole : moles) {
            Mole mole1 = new Mole(mole[0], mole[1], mole[2]);
            moleList.add(mole1);
        }
        moleList.sort(Comparator.comparingInt(Mole::getTime));

        int maxScore = 0;
        for(int i = 1; i <= n; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(i);

            for(int j = 1; j < m; j++) {
                int e = (i + j);
                set.add(e > n? e % n : e);
            }

            Stack<Mole> stack = new Stack<>();
            for (Mole mole : moleList) {
                if (set.contains(mole.getNumber())) {
                    if(stack.isEmpty()) stack.push(mole);
                    else {
                        Mole peek = stack.peek();
                        if(peek.getTime() == mole.getTime() && peek.getScore() <= mole.getScore()) {
                            stack.pop();
                            stack.push(mole);
                        } else {
                            stack.push(mole);
                        }
                    }

                }
            }

            int scoreSum = 0;
            while(!stack.isEmpty()) {
                Mole pop = stack.pop();
                scoreSum += pop.getScore();
            }

            if(scoreSum > maxScore) maxScore = scoreSum;
        }

        return maxScore;
    }

    public static class Mole {
        private int time;
        private int number;
        private int score;

        public Mole(int time, int number, int score) {
            this.time = time;
            this.number = number;
            this.score = score;
        }

        public int getTime() {
            return time;
        }

        public int getNumber() {
            return number;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return "Mole{" +
                    "time=" + time +
                    ", number=" + number +
                    ", score=" + score +
                    '}';
        }
    }
}
