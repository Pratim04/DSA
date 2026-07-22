class demo {
    public static void main(String[] args) {
        student pratim = new student();

        System.out.println(pratim.rno);
    }
}

class student{
    int rno;
    String name;
    float marks;

    // Constructor
    student (){
        // pratim.rno = 25;
        // pratim.name = "Partim";
        // pratim.marks = 69;
        // but it's only for pratim we can make other reference variable
        // so we use this keyword

        this.rno = 25;
        this.name = "Pratim";
        this.marks = 63.5f;

        // It will exchange the place with this keyword with the reference variable
    }
}