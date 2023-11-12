public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "мужской";
        wolf.nickname = "Беглец";
        wolf.weight = 54.5F;
        wolf.age = 4;
        wolf.color = "серый";

        System.out.println("Пол волка - " + wolf.gender + "\n" + "Кличка - " + wolf.nickname + "\n" +
                "Вес - " + wolf.weight + " кг. " + "\n" + "Возраст - " + wolf.age + "\n" + "Цвет волка - " + wolf.color + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}