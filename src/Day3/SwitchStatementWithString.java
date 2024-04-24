package Day3;

public class SwitchStatementWithString {
    public static void main(String[] args) {
        String levelMatch = "Expert";

        int level = 0;

        switch (levelMatch){
            case "Intermidiate":
                level = 1;
                break;
            case "Beginer":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level =-1;
                break;
        }

        System.out.println(level);

    }
}
