public class WhatToDo {
    public static void main(String[] args) {
        // Time is Good or Late
        int time = 24;
        boolean isLate = time >= 23 || time <=5;
        // Weather is Good or Bad
        boolean isWeatherGood = true;
        // Deciding What to do
        if (isLate) {
            System.out.println("Sleep");
        }
        if (!isLate && isWeatherGood) {
            System.out.println("Walk");
        }
        if (!isLate && !isWeatherGood) {
            System.out.println("Read a Book");
        }

    }
}
