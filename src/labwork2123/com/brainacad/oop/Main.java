package labwork2123.com.brainacad.oop;

public class Main {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        MyPhone.MyPhoneBook myPhoneBook = myPhone.new MyPhoneBook();
        myPhone.switchOn();
        myPhone.call(1);
    }
}