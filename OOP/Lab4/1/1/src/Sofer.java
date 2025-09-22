public class Sofer {


    private String name;
    private int age;
    private String dataPermis;

    public Sofer(String name, int age, String dataPermis){
        this.name = name;
        this.age = age;
        this.dataPermis = dataPermis;
    }

   public Sofer(){
        this.name = "Nicu";
        this.age = 22;
        this.dataPermis = "11-05-2019";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nData permis: " + dataPermis;
    }


    public static void main(String[] args) {

    }

}
