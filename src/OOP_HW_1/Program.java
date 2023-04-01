package OOP_HW_1;

public class Program {
    public static void main(String[] args) {


        Person person = new Person("Pavel", 35);
        Person person2 = new Person("Ksy",3);
        Parents parent = new Parents(person, Status.parents);
        Kids kids = new Kids(person2,Status.children);

        if(Status.parents == parent.getStatus()){
            System.out.printf("%s является родителем %s", parent,kids);

        }


    }
}
