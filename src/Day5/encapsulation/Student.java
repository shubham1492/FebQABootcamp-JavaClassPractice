package Day5.encapsulation;

public class Student {

    private String name;

    private String collageName = "SGITC";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCollageName() {
        return collageName;
    }
}
