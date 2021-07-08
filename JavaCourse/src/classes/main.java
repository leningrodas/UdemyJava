package classes;

public class main {
    public static void main(String[] args) {
        car porsche = new car();
        car fourrunner = new car ();
        System.out.println("porchse is " + porsche.getColor()+ " " + porsche.getModel());
        porsche.setModel("porsche");
        porsche.setColor("black");
        System.out.println("porchse is " + porsche.getColor()+ " " + porsche.getModel());

        simpleCalculator calc = new simpleCalculator();
        calc.setFirstNumber(8);
        calc.setSecondNumber(4);
        System.out.println("multiplication " + calc.getMultiplacationResult());

        Person newPerson = new Person();
        newPerson.setFirstName("");
        newPerson.setLastName("");
        newPerson.setAge(10);

        System.out.println("fullname= " + newPerson.getFullName());
        System.out.println("teen= " + newPerson.isTeen());

//        newPerson.setFirstName("lening");
//        newPerson.setLastName("kinglen");
//        newPerson.setAge(19);
//        System.out.println("fullname is = " + newPerson.getFullName());

        newPerson.setFirstName("lening");

        newPerson.setAge(19);
        System.out.println("fullname is = " + newPerson.getFullName());


}
}
