public class CodingBat {

//TODO: 1. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        } else if (vacation) {
            return true;
        } else {
            return false;
        }
    }

//TODO: 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

//TODO: 3. Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }

}
