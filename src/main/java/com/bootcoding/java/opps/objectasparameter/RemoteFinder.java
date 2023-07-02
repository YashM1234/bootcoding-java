package com.bootcoding.java.opps.objectasparameter;
//Here we pass object as parameter and find remote is expensive, affordable or cheaper
public class RemoteFinder {
    public static void main(String[] args) {
        Remote remote  = new Remote("VideoCon", "Gray", 105.00);
        //pass object of remote class as parameter in quality method and store return value in result variable
        String result = RemoteFinder.quality(remote);
        System.out.println("The remote is " + result);
    }

    // Method to check remote is expensive, affordable or cheaper
    public static String quality(Remote r) {
        if (r.price >= 120) {
            return "expensive";
        } else if (r.price < 120 && r.price > 100) {
            return "affordable";
        }
        return "cheaper";
    }
}
