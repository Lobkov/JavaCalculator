package sample;

public class Controller {
    public void button7Clicked() {
        System.out.println("Button clicked! {" + MainScreen.screen + "}");
    }
    public void button8Clicked() {
        MainScreen.Add(8);
        System.out.println("Button clicked! {" + MainScreen.screen + "}");
    }

    public void button9Clicked() {
        MainScreen.Action("9");
        //System.out.println("Button clicked! {" + MainScreen.screen + "}");
    }


    public void buttonPlusClicked() {
        System.out.println("Button clicked! {" + MainScreen.screen + "}");
    }

    public void buttonEqualsClicked() {
        System.out.println("Button Equals clicked! {" + MainScreen.screen + "}");
    }


}
