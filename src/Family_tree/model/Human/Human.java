package Family_tree.model.Human;

import Family_tree.Family_tree.ItemFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Human implements ItemFamilyTree<Human> {
    private long id;
    private String name;
    private Gender gender;
    private int yearOfBirth;
    private Human mother;
    private Human father;
    private List<Human> children;
    private Human spouse;

    public Human (String name, Gender gender, int yearOfBirth, Human mother, Human father){
        id = -1;
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }
    public Human (String name, Gender gender, int yearOfBirth){
        id = -1;
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        children = new ArrayList<>();
    }

    public boolean addChildren(Human child){
        if(!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }
    public boolean addParents(Human parent){
        if(parent.getGender().equals(Gender.Male)){
            setFather(parent);
        } else if (parent.getGender().equals(Gender.Female)) {
            setMother(parent);
        }
        return true;
    }

    public int getYearOfBirth() {return yearOfBirth;}

    public void setYearOfBirth(int yearOfBirth) {this.yearOfBirth = yearOfBirth;}

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Gender getGender() {return gender;}

    public void setGender(Gender gender) {this.gender = gender;}

    public Human getMother() {return mother;}

    public void setMother(Human mother) {this.mother = mother;}

    public Human getFather() {return father;}

    public void setFather(Human father) {this.father = father;}

    public List<Human> getChildren() {return children;}

    public void setChildren(List<Human> children) {this.children = children;}

    public Human getSpouse() {return spouse;}

    public void setSpouse(Human spouse) {this.spouse = spouse;}

    public List<Human> getParents(){
        List<Human> lists = new ArrayList<>(2);

        if(father != null){
            lists.add(father);
        }
        if(mother != null){
            lists.add(mother);
        }
        return lists;
    }
    public String spouseInfo(){
        String res;
        if(spouse == null){
            res = "нету";
        } else{
            res = spouse.getName();
        }
        return res;
    }

    public String motherInfo(){
        String res;
        Human mother = getMother();
        if(mother == null){
            res = "-";
        } else {
            res = mother.getName();
        }
        return res;
    }

    public String fatherInfo(){
        String res;
        Human father = getFather();
        if(father == null){
            res = "-";
        } else {
            res = father.getName();
        }
        return res;
    }

    public String childrenInfo(){
        StringBuilder res = new StringBuilder();
        if(!children.isEmpty()){
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        }else {
            res.append("-");
        }
        return res.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", имя: ");
        sb.append(name);
        sb.append(", пол: ");
        sb.append(gender);
        sb.append(", год рождения: ");
        sb.append(yearOfBirth);
        sb.append(", супруг/а: ");
        sb.append(spouseInfo());
        sb.append(", мать: ");
        sb.append(motherInfo());
        sb.append(", отец: ");
        sb.append(fatherInfo());
        sb.append(", дети: ");
        sb.append(childrenInfo());
        return sb.toString();
    }
}
