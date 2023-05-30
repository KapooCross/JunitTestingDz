package by.itstep.java1022.JB.model.logic;

import java.util.Arrays;

public class ActionOnExam {

    //обрабатывает результаты экзамена
    public String processingOfExamResult(int[] mark) {

        //защита от дурака
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > 5 || mark[i] < 0) {
                return "Оценки заданы неверно!";
            }
        }

        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        int countFive = 0;

        for (int i = 0; i < mark.length; i++) {
            switch (mark[i]) {
                case 0:
                    countZero++;
                    break;
                case 1:
                    countOne++;
                    break;
                case 2:
                    countTwo++;
                    break;
                case 3:
                    countThree++;
                    break;
                case 4:
                    countFour++;
                    break;
                case 5:
                    countFive++;
                    break;
            }
        }

        float percentZero = (float) (countZero * 100) / mark.length;
        float percentOne = (float) (countOne * 100) / mark.length;
        float percentTwo = (float) (countTwo * 100) / mark.length;
        float percentThree = (float) (countThree * 100) / mark.length;
        float percentFour = (float) (countFour * 100) / mark.length;
        float percentFive = (float) (countFive * 100) / mark.length;


//        return "Исходные оценки: " + Arrays.toString(vector) + "\n" +
//                "Результаты экзамена: \n" +
//                "Пятерок - " + percentFive +"% (" + countFive +")\n" +
//                "Четверок - " + percentFour +"% (" + countFour +")\n" +
//                "Троек - " + percentThree +"% (" + countThree +")\n" +
//                "Двоек - " + percentTwo +"% (" + countTwo +")\n" +
//                "Единиц - " + percentOne +"% (" + countOne +")\n";


        return String.format("Исходные оценки: %s\n" +
                        "Результаты экзамена:\n" +
                        "Пятерок - %.1f%% (%d)\n" +
                        "Четверок - %.1f%% (%d)\n" +
                        "Троек - %.1f%% (%d)\n" +
                        "Двоек - %.1f%% (%d)\n" +
                        "Единиц - %.1f%% (%d)\n" +
                        "Нулей - %.1f%% (%d)\n",
                Arrays.toString(mark), percentFive, countFive, percentFour,
                countFour, percentThree, countThree, percentTwo, countTwo,
                percentOne, countOne, percentZero, countZero);


    }
}
