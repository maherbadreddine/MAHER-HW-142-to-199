package org.example.e159;


public class SecuritySystem {

    private static void authenticate() {
        System.out.println("Authenticating with password");

    }
    private static void authenticate(int otp){
        System.out.println("Authenticating with OTP: "+otp);

    }

    public static void performAuthentication(){
        authenticate();
        authenticate(123456);
    }

    public static void main(String[] args) {
        SecuritySystem s = new SecuritySystem();
        performAuthentication();
    }
}