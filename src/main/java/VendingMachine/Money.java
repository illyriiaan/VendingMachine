package VendingMachine;

enum Coins {
    ONE(1), TWO(2), FIVE(5), TEN(10);
    private int denomination;

    private Coins(int denomination){
        this.denomination = denomination;
    }
    public int getDenomination(){
        return denomination;
    }
}
