package homework;

import homework.task_46.Task_46_Beautiful_Output;
import homework.test.TestMenu;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final String DELIMITER = "_";


    private static final String AVAILABLE_COMMANDS = new StringBuilder()
            .append("Available commands list: ")
            .append("\n\tExit: 0")
            .append("\n\tAdd key value pair: 1_key_value")
            .append("\n\tGet value by key: 2_key")
            .append("\n\tGet all key values set: 3")
            .toString();

    public static void main(String[] args) throws IOException {

        String PATH = "/Users/maksimplaksa/IdeaProjects/HomeworkJava";
        File file = new File(PATH);

        Task_46_Beautiful_Output.filesSort(file, 1);


        File file1 = new File("/Users/maksimplaksa/IdeaProjects/HomeworkJava/lol");

        if(!file1.exists()) {
            file1.createNewFile();
            System.out.println(file + "the file was created");
        }else {
            System.out.println("already exist");
        }


//        ArrayList<Integer> marks = new ArrayList<Integer>();

        /*for (int i = 0; i < 10; i++) {
            marks.add(ThreadLocalRandom.current().nextInt(0, 10));
        }
        System.out.println(marks);*/

        Map<String, String> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//                статик работает на все экземпляры класса
        while (true) {
            System.out.println(AVAILABLE_COMMANDS);
            System.out.println("Type next command please.");

            String line = null;
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException("Cannot read line from console");
            }
            if (!line.matches("(0)" +
                    "|(1_[a-zA-Z0-9]{1,10}_[a-zA-Z0-9]{1,10})" +
                    "|(2_[a-zA-Z0-9]{1,10})" +
                    "|(3)")) {
                System.out.println("Command is invalid!");
                System.out.println(AVAILABLE_COMMANDS);
                continue;
            }
            if (line.isBlank()) {
                System.out.println("Command must be not empty!");
                continue;
                //                перейдем опять к while
            }
//??????????????????????????????????????????????????????????????????????????????????????????????????????????
            TestMenu command = TestMenu.values()[Character.getNumericValue(line.charAt(0))];
//??????????????????????????????????????????????????????????????????????????????????????????????????????????
            switch (command) {
                case EXIT_COMMAND -> {
                    System.out.println("Goodbye.");
                    return;
                }
                case ADD_COMMAND -> {
                    String[] splittedLine = line.split(DELIMITER);
                    String key = splittedLine[1];
                    String value = splittedLine[2];
                    map.put(key, value);
                    break;
                }
                case GET_BY_KEY_COMMAND -> {
                    String[] splittedLine = line.split(DELIMITER);
                    String key = splittedLine[1];
                    System.out.println(map.get(key));
                    break;
                }
                case GET_ALL_COMMAND -> {
                    System.out.println(map);
                    break;
                }
                default -> {
                    System.out.println("No such command!");
                }
            }
        }
    }
    }
