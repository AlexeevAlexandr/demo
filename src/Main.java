import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Character> QUESTIONS = new HashMap<String, Character>() {
        {
            put("method Thread is a process", 'N');
            put("method List cannot contain duplicates", 'N');
            put("method Set can contain duplicates", 'N');
            put("Java is platform independent", 'Y');
            put("Java supports copy constructors like C++", 'Y');
            put("The primitive data types supported by the Java programming language are: byte, short, int, long, float, double, boolean, char", 'Y');
            put("Constructor overloading is similar to method overloading in Java", 'N');
            put("The purpose of garbage collection in Java is to reclaim and reuse objects which are no longer used", 'Y');
            put("Autoboxing is the automatic conversion made by the Java compiler between the primitive types and their corresponding object wrapper classes", 'Y');
            put("JDBC is an abstraction layer that allows users to choose between databases", 'Y');
            put("Java supports the usage of pointers", 'N');
        }
    };
    public static void main(String[] args){
        class MainUtil {
            private static final String JUNIOR = "You are a junior Java developer";
            private static final String MIDDLE = "You are a middle Java developer";
            private static final String SENIOR = "You are a senior Java developer";
            private final Scanner scanner;
            private MainUtil() {
                this.scanner = new Scanner(System.in);
            }
            private void evaluateUser(Map<String, Character> questionsMap) {
                greetings();
                int score = countUserScore(questionsMap);
                evaluateScore(score);
            }
            private int countUserScore(Map<String, Character> questionsMap) {
                int numberOfQuestions = questionsMap.size();
                int questionCounter = 1;
                int score = 0;
                for (Map.Entry<String, Character> entry : questionsMap.entrySet()) {
                    String key = entry.getKey();
                    writeToConsole(String.format("Question №%s of %s", questionCounter++, numberOfQuestions));
                    writeToConsole(key);
                    writeToConsole("Please, put your answer:");
                    if (validateAnswer(questionsMap, key, readAnswerFromTheConsole())) {
                        score++;
                    }
                }
                return score;
            }
            private void greetings() {
                writeToConsole("Welcome to the amazing Java knowledge testing program.");
                writeToConsole("Below, you will see the questions. Please put answers, using N or Y.");
                writeToConsole("Other symbols would de considered as incorrect answer.");
                writeToConsole("Good Luck!");
                writeToConsole("");
            }
            private  String readAnswerFromTheConsole() {
                return scanner.nextLine();
            }
            private void writeToConsole(String text) {
                System.out.println(text);
            }
            private boolean validateAnswer(Map questions, String key, String userAnswer) {
                return String.valueOf(questions.get(key)).equals(userAnswer);
            }
            private void evaluateScore(int score) {
                if (score < 4) {
                    writeToConsole(JUNIOR);
                } else if (score < 8) {
                    writeToConsole(MIDDLE);
                } else {
                    writeToConsole(SENIOR);
                }
            }
        }
        MainUtil mainUtil = new MainUtil();
        mainUtil.evaluateUser(QUESTIONS);
    }
}