package sample;

public class MainScreen {
    public static float screen;
    public static String secondScreen;

    public MainScreen(){
        this.screen = 0;
        this.secondScreen = "";

    }

    public static void Add(int a, int b){
        screen = a + b;
    }

    public static void Add(int a){
        screen += a;
    }

    public static void Action(String str){
        secondScreen += str;
        System.out.println(str);

    }

    public static void Execute(int a){
        System.out.println(screen);
    }

}
