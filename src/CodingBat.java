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

//TODO: 4. Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

//TODO: 5. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 || hour > 20) {
            return talking;
        } else {
            return false;
        }
    }

//TODO: 6. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public boolean makes10(int a, int b) {
        if (a == 10 || b ==10) {
            return true;
        } else if (a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

//TODO: 7. Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10)) {
            return true;
        } else if ((Math.abs(200 - n) <= 10)) {
            return true;
        } else {
            return false;
        }
    }
//    //another method//
//    public boolean nearHundred(int n) {
//        return ((Math.abs(100 - n) <= 10) ||
//                (Math.abs(200 - n) <= 10));
//    }

//TODO: 8. Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.



}
