// Written by Salee036
public class WindChill {
    public static void main(String[] args) {        
        float temp = Float.parseFloat(args[0]);
        float windSpeed = Float.parseFloat(args[1]);
        double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);
         System.out.println("The windchill at "+temp+ " and windspeed "+windSpeed+" is " + windChill);
    }
}