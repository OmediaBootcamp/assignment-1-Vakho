package dev.omedia;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigFlourBag = 5;
        int sumOfBigBag = bigFlourBag * bigCount;
        if(sumOfBigBag >= goal) {
            int remaining = goal % bigFlourBag;
            System.out.println("jere" + (goal - sumOfBigBag));
            if(smallCount >= remaining) {
                System.out.println("jere");
                return true;
            }
        } else {
            return smallCount >= goal - sumOfBigBag;
        }
        return false;

    }
}
