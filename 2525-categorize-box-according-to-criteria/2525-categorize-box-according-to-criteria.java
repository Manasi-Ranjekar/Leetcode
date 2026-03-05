class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        boolean bulky = isBulky(length, width, height);
        boolean heavy = mass >= 100;

        if (bulky && heavy) {
            return "Both";
        } 
        else if (!bulky && !heavy) {
            return "Neither";
        } 
        else if (!bulky && heavy) {
            return "Heavy";
        } 
        else {
            return "Bulky";
        }
    }

    private static boolean isBulky(int length, int width, int height) {
        long volume = (long) length * width * height;

        if (Math.max(length, Math.max(width, height)) >= 10_000) {
            return true;
        }

        if (volume >= 1_000_000_000) {
            return true;
        }

        return false;
    }
}