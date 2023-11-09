import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) { // 2人分の入力と計算を行うためのループ
            System.out.println("身長（身長（例：１６０なら１．６など））を入力してください（" + i + "）：");
            double height = scanner.nextDouble();
            System.out.println("体重を入力してください（" + i + "）：");
            double weight = scanner.nextDouble();
            double bmi = calculateBMI(height, weight);
            System.out.printf("1" + i + " のBMIは %.2f です。\n", bmi);
            String message = interpretBMI(bmi);
            System.out.println(message);
        }
    }
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
    public static String interpretBMI(double bmi) {
        String category;
        if (bmi < 18.5) {
            category = "やせすぎ";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "平均的な体重";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            category = "やや太り気味";
        } else {
            category = "肥満";
        }
        String message = "あなたのBMIは " + String.format("%.2f", bmi) + " の" + category + " です。\n";
        if (category.equals("平均的な体重")) {
            message += "健康的です。この状態を維持しましょう。";
        } else {
            message += "適正体重を目指すために、筋肉を付ける、運動するを心がけましょう。";
        }
        return message;
    }
}


