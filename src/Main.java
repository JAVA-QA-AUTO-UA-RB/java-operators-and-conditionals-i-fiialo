import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int health = 100;
        int luck = 50;
        // Перший етап пригоди
        System.out.println("Ласкаво просимо до казкового лісу!");
        System.out.println("Ваше завдання - пройти через ліс, ухвалюючи правильні рішення.");
        System.out.println("На старті у вас:");
        System.out.println("Здоров'я: 100");
        System.out.println("Удача: 50");
        System.out.println("Подія 1: Ви знайшли роздоріжжя. Виберіть шлях:");
        System.out.println("1 - Стара хитка стежка");
        System.out.println("2 - Скарб серед кущів");

        int choice1 = sc.nextInt();

        if (choice1 == 1) {
            health -= 20;
            System.out.println("Ти пішов старою стежкою та втрачаєш 20 очок здоров’я. Здоров’я: - " + health);
        } else if (choice1 == 2) {
            luck += 30;
            System.out.println("Ти знайшов скарб та отримуєш 30 очок удачі. Удача - " + luck);
        } else {
            health -= 10;
            System.out.println("Ти заплутався та втрачаєш 10 очок здоров’я. Здоров’я: - " + health);
        }

        // Другий етап пригоди
        System.out.println("Подія 2: Перед вами загадковий колодязь. Що ви зробите?");
        System.out.println("1 - Пити з колодязя");
        System.out.println("2 - Ігнорувати");

        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            health += 50;
            System.out.println("Ви зважилися пити з колодязя... Магічна вода відновила вам 50 очок здоров’я. " + health);
        } else if (choice2 == 2) {
            luck -= 10;
            System.out.println("Ти проігнорував колодязь, але втомлюєшся та втрачаєш 10 очок удачі — тепер твоя удача: " + luck);
        } else {
            System.out.println("Герой чекає твого вибору...");
        }
        // Третій етап пригоди
        System.out.println("Подія 3: Ви зустріли чарівну істоту. Що буде далі?");

        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;

        switch (randomNumber) {
            case 1:
                health += 20;
                System.out.println("Істота дружня і ділиться їжею (+20 здоров'я). Здоров’я: " + health);
                break;
            case 2:
                health -= 30;
                System.out.println("Істота ворожа і атакує (-30 здоров’я). Здоров’я: " + health);
                break;
            default:
                System.out.println("Істота байдужа, нічого не змінюється.");
                break;
        }
        if (health <= 0 || luck <= 0) {
            System.out.println("Ви не змогли пройти ліс... Спробуйте ще раз!");
        } else {
            System.out.println("Вітаємо! Ви змогли пройти через чарівний ліс!");
        }

        System.out.println("Поточний стан:");
        System.out.println("Здоров'я: " + health);
        System.out.println("Удача: " + luck);

        {  // Кінець
        System.out.println("КІНЕЦЬ ВИКОНАННЯ ПРОГРАМИ");
        }
    }
}