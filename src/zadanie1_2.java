//пример 4.2
public class zadanie1_2 {
    public static void main(String[] args){
        try{
           System.out.println("0");
           throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("1"+e);
        }
        System.out.println("2");
    }
}
