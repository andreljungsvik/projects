// Den här klassen reprensenterar en spargris

public class PiggyBank {
    private int coinCount = 0;
    private int coinSum = 0;
    final private int[] validCoins = { 1, 2, 5, 10 }; // tillåtna mynt. oförändbar

    // lägger till mynt och retunerar true eller false beroende på giltigthet
    public boolean addCoins(int coin) {
        for (int validCoin : validCoins) {
            if (coin == validCoin) {
                coinCount++;
                coinSum += coin;
                return true;
            }
        }
        return false;
    }

    public int getCoinCount() {
        return coinCount;
    }

    public int getCoinSum() {
        return coinSum;
    }
}