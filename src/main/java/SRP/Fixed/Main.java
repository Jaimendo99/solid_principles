package SRP.Fixed;


class Main {
    public static void main(String[] args) {
        SRP.Original.UserManager userManager = new SRP.Original.UserManager();
        userManager.addUser("example@domain.com", "password123");
        userManager.addUser("invalid-email", "1234");
    }
}