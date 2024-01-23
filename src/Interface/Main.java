package Interface;
interface I1 {
    int a = 10;
    void display();
}
    class c1 implements I1{
        @Override
        public void display() {
            System.out.println("Geek");
        }
        public static void main(String[] args){
            c1 c = new c1();
            c.display();
            System.out.println(a);
        }
    }

