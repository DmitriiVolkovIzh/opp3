public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower("Роза обыкновенная","Голандий",35.59,0);
        rosa.setLifeSpan(15);
        Flower hrizantema = new Flower("Хризантема",null,15,5);
        Flower pion = new Flower("Пион","Англий",69.9,1);
        Flower gipsofila = new Flower("Гипсофила","Турций",19.5,10);
        System.out.println(rosa);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);


    }
}