//пример 4.1
 class zadanie1_1 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //throw - "брошено" исключение, создан экземпляр RuntimeException с сообщением
        } catch (RuntimeException e) { //исключение перехвачено
            System.out.println("1 "+e);//исключение обработано
        }
        System.out.println("2");
    }
}
