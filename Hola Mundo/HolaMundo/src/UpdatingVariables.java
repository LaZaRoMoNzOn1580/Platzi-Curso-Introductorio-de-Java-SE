public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        salary += 200;
        System.out.println(salary);

        salary -= 50;
        System.out.println(salary);

        salary += (2*30) - 45;
        System.out.println(salary);

        String employeeName = "Larry";
        employeeName += " Torres Lion";
        System.out.println(employeeName);

        employeeName = "The best coder in the world " + employeeName;
        System.out.println("Tittle: " + employeeName);
    }
}
