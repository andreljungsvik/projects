public class PiggyBank {
    private int coinCount = 0;
    private int coinSum = 0;
    final private int[] validCoins = { 1, 2, 5, 10 }; //array med tillåtna mynt. oförändbar

    public void addCoins(int coin) { 
        for (int validCoin : validCoins) {
            if (coin == validCoin) {
                coinCount++;
                coinSum += coin;
                break;
            }
        }
    }

    public int getCoinCount() {
        return coinCount;
    }

    public int getCoinSum() {
        return coinSum;
    }
}