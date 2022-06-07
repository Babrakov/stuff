package check_internet;

public class CheckInternetConnection {

    public static void main(String[] args) throws Exception {
        Process process = java.lang.Runtime.getRuntime().exec("ping ya.ru");
        int x = process.waitFor();
        if (x==0) {
            System.out.println("Connection successful, "+ "Output was " + x);
        } else {
            System.out.println("Internet not connected, "+ "Output was " + x);
        }
    }

}
