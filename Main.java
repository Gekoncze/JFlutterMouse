public class Main {
    public static void main(String[] args) {
        try {
            boolean direction = false;
            while(true){
                Runtime.getRuntime().exec("xdotool mousemove_relative -- " + (direction ? 1 : -1) + " 0");
                direction = !direction;
                Thread.sleep(25);
            }
        } catch (Exception e) {
        }
    }
}
