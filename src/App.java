public class App {
    public static void main(String[] args){
        App app = new App();
        app.print(false);
        app.print(1);
        app.print(1.0);
        app.print("Hello World!");
    }

    public void print(String text){
        System.out.println(text);
    }

    public void print(int number){
        System.out.println(number);
    }

    public void print(double number){
        System.out.println(number);
    }

    public void print(boolean bool){
        System.out.println(bool);
    }
}
