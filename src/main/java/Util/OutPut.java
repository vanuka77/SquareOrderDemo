package Util;

import Service.Storage;

public class OutPut {

    public void printInstruction() {
        System.out.println("Квадрат числа должен быть меньше n,введите n. \n" +
                "После  ввода нажмите enter.");
    }

    public void printError() {
        System.err.println("Некоректные данные");
    }

    public void printContinueInstruction() {
        System.out.println("Чтобы продолжить введите y/yes");
    }

    public void printResult(Storage storage) {
        System.out.println("Ответ : \n" + storage.getArrayList());
    }
}
