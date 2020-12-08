package ru.PolukarovIvan.lab_24.ex3_phone;

public class Phone {
    String phone;
    String code;
    String firstPart;
    String secondPart;
    String thirdPart;


    public Phone(String phone) {
        if (phone.startsWith("+")) {
            phone = phone.substring(1);
        }

        this.code = phone.substring(0, phone.length() - 10);
        phone = phone.substring(this.code.length());

        this.firstPart = phone.substring(0, 3);
        phone = phone.substring(3);

        this.secondPart = phone.substring(0, 3);
        phone = phone.substring(3);

        this.thirdPart = phone;

    }

    public String getPhone() {
        return "+ " + this.code + " (" + this.firstPart + ")" + "-" + this.secondPart + "-" + this.thirdPart;
    }


}
