package Service;

import Model.Model;

public class Work {
    public void findSquaresToLimitFigure(Model model, Storage storage) {
        int square=0;
        for (int i = 0;  ; i++) {
            square= (int) Math.pow(i,2);
            if(square > model.getLimit()){
                break;
            }
            storage.getArrayList().add(i);
        }
    }
}
