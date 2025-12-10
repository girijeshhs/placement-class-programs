package Revamp;
class hello {
    int age;
    String name;

    hello(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Main {
    public static void main(String[] args) {
        hello me = new hello("vanako", 21);
        me.display();
    }
}
