package controller;

public class CheckConstructorAndSetterGetter {
    public int a, b;

    public CheckConstructorAndSetterGetter() {
    }

    public CheckConstructorAndSetterGetter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setAB(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public AB getAB(){
        AB ab = new AB(this.a, this.b);
        return ab;
    }
}
