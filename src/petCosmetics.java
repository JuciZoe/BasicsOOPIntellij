public class petCosmetics {
   private  String name;
    private String type;
   private  double age;

   private  double weight;

   public petCosmetics (String name, String type, double age, double weight, double setToBeApplied) {
    setName(name);
    setType(type);
    setAge(age);
    setWeight(weight);
    setToBeApplied(age);
    }

    public void setName(String name){
    this.name = name;
    }

    public String getName (){
       return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType (){
        return type;
    }

    public void setAge(double age){
        this.age = age;
    }

    public double getAge (){
        return age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight (){
        return weight;
    }

    public void setToBeApplied (double age){
       this.age = age;
    }
    public double getToBeApplied() {
        if (age < 1) {
            System.out.println("Pet can't have appointment in the Petcosmetics");
        } else {
            System.out.println("Pet can have an appointment in the Petcosmetics");
        }
        return age;
    }
}
