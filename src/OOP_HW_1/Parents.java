package OOP_HW_1;

public class Parents {

    private Status status;
    private Person person;

    public Parents(Person person,Status status){
        this.person = person;
        this.status = status;
    }
    public Status setStatus(){
        return status;
    }


    @Override
    public String toString() {
        return "Parents{ " + person.getName() +
                "  status = " + status +
                '}';
    }

    public Status getStatus() {
        return status;
    }
}
