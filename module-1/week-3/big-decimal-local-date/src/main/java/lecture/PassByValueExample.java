package lecture;

public class PassByValueExample {
    public static void main(String[] args) {
        new PassByValueExample().run();
    }

    public void run(){
        String veg = "potato";
        change(veg);
        System.out.println(veg);
    }

    public void change(String vegetable){
        vegetable = vegetable + " salad";
    }
}
