package Controller;

import Model.Model;
import Service.ModelArguments;
import Service.Storage;
import Service.Work;
import Util.Input;
import Util.OutPut;
import Validator.ArgumentsValidator;

import java.util.InputMismatchException;


public class Controller {

    boolean isWorkedWithArguments = false;
    boolean areSetModelArguments = false;

    OutPut outPut = new OutPut();
    ModelArguments modelArguments = new ModelArguments();
    Model model = new Model();
    Work work = new Work();
    Storage storage = new Storage();

    public void run(String[] args) {
        String isContinued = "y";
        while (isContinued.equals("y") || isContinued == "yes") {
            if (!ArgumentsValidator.areArguments(args) || isWorkedWithArguments) {
                outPut.printInstruction();
                try {
                    areSetModelArguments = modelArguments.setWithNoArguments(model);
                } catch (InputMismatchException e) {
                    areSetModelArguments = false;
                    outPut.printError();
                }
            } else {
                try {
                    areSetModelArguments = modelArguments.setWithArguments(model, args);
                } catch (NumberFormatException e) {
                    areSetModelArguments = false;
                    outPut.printError();
                }
            }
            if (areSetModelArguments) {
                work.findSquaresToLimitFigure(model,storage);
                outPut.printResult(storage);
            }
            outPut.printContinueInstruction();
            isContinued = Input.inputString().toLowerCase();
            isWorkedWithArguments = true;
            storage.getArrayList().clear();
        }

    }

}
