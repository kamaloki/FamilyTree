package Family_tree.presenter;

import Family_tree.model.service.Service;
import Family_tree.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, String gender, int age) {
        service.addHuman(name, gender, age);
        getHumanListInfo();
    }

    public void getHumanListInfo() {
        String answer = service.getServiceListInfo();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByName();
        getHumanListInfo();
    }

    public void sortByYear() {
        service.sortByYear();
        getHumanListInfo();
    }
}
