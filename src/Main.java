public class Main {
    public static void main(String[] args) {
        petCosmetics a01 = new petCosmetics("Sumerset", "Cat", 3,2.7, 3);
        petCosmetics a02 = new petCosmetics("KitKat", "Cat", 2,3, 2);
        petCosmetics a03 = new petCosmetics("Momo", "Dog", 1,15, 1);
        petCosmetics a04 = new petCosmetics("Tony", "Hedgehog", 0.5,1, 0.5);

        System.out.println("The first pet's name is " + a01.getName() + " its age is " + a01.getAge()
                +"its weight is" + a01.getWeight() + a01.getToBeApplied());


        System.out.println("The second's pet's name is " + a02.getName() + " its age is " + a02.getAge()
                +" its weight " + a02.getWeight() +  a01.getToBeApplied());


        System.out.println("The third pet's name is " + a03.getName() + " its age is " + a03.getAge()
                +" its weight is " + a03.getWeight() +  a01.getToBeApplied());


        System.out.println("The fourth pet's name is " + a04.getName() + " its age is " + a04.getAge()
                +" its weight is " + a04.getWeight() + a01.getToBeApplied());


    }
}