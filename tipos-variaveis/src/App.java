public class App {
    public static void main(String[] args) throws Exception {
     
        SmartTv smartTv = new SmartTv();
 
        System.out.println("A TV esta ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
    }
}
