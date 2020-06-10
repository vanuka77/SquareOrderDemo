package Service;

import Model.Model;
import Util.Input;

public class ModelArguments {
    public boolean setWithArguments(Model model,String[] args) throws NumberFormatException {
        model.setLimit(Integer.parseInt(args[0]));
        return true;
    }

    public boolean setWithNoArguments(Model model) throws NumberFormatException {
        model.setLimit((int)Input.inputDouble());
        return true;
    }
}
