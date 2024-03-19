class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastTime = attacks[attacks.length - 1][0];
        int nowHealth = health;
        int successTime = 0;

        for (int i = 1; i <= lastTime; i++) {
            boolean isAttacked = false;

            for (int j = 0; j < attacks.length; j++) {
                if (i == attacks[j][0]) {
                    isAttacked = true;
                    nowHealth -= attacks[j][1];
                    successTime = 0;
                    if (nowHealth <= 0) return -1;
                    break;
                }
            }

            if (!isAttacked) {
                successTime++;
                nowHealth += bandage[1];
                if (successTime == bandage[0]) {
                    nowHealth += bandage[2];
                    successTime = 0;
                }
                if (nowHealth > health) {
                    nowHealth = health;
                }
            }
        }

        int answer = nowHealth;
        return answer;
    }
}