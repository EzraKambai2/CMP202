public class Main {
    void addNumber(int x, int y){
            System.out.println(x+y);
    }
    public static void main(String[] args) {
        Computer Dell = new Computer(new Ram(), new Processor(), new Storage());
        System.out.println(Dell);
        Main main = new Main();
        
        main.addNumber(5, 6);        
    }
}
