class Calculator {
    public static void main(String args[]){
        System.out.println("Main class");
        Display obj = new Display(10);
        obj.display();
        Display obj2 = new Display(20);
        obj2.display();

    }
}
class Display {
    int n;
    Display(int n){
        System.out.println("I am constructor " + n);
        this.n = n;
    }
    void display(){
        System.out.println(this.n);
    }
}