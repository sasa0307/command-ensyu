import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長（メートル単位）を入力してください：");
        double height = scanner.nextDouble();
        System.out.println("体重（キログラム単位）を入力してください：");
        double weight = scanner.nextDouble();
        double bmi = calculateBMI(height, weight);
        System.out.printf("あなたのBMIは %.2f です。\n", bmi);
        String message = interpretBMI(bmi);
        System.out.println(message);
    }
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
    public static String interpretBMI(double bmi) {
        String category;
        if (bmi < 18.5) {
            category = "やせすぎ";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "平均体重です";
        } else if (bmi >= 24.9 && bmi < 29.9) {
            category = "やや太り気味です";
        } else {
            category = "肥満です";
        }
        String message = "あなたのBMIは " + String.format("%.2f", bmi) + " で、" + category + " です。\n";
        if (category.equals("適正体重")) {
            message += "健康的です。この状態を維持しましょう";
        } else {
            message += "平均体重を目指し、頑張りましょう";
        }
        return message;
    }
}