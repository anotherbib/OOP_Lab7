public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);

        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        Employee salesEmp1 = new Employee("Wiroj", "Sales", 150000);
        Employee salesEmp2 = new Employee("Weeranan", "Sales", 100000);

        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        Employee marketingEmp1 = new Employee("Oak", "Marketing", 200000);
        Employee marketingEmp2 = new Employee("Aem", "Marketing", 250000);

        ceo.add(headSales);
        headSales.add(salesEmp1);
        headSales.add(salesEmp2);

        ceo.add(headMarketing);
        headMarketing.add(marketingEmp1);
        headMarketing.add(marketingEmp2);

        printAllEmployee(ceo, 0);
    }

    public static void printAllEmployee(Employee employee, int level) {
        String str = "";
        for (int i = 0; i < level; i++) {
            str += "   ";
        }
        System.out.println(str + employee);
        for (Employee subordinate : employee.getEmp()) 
            printAllEmployee(subordinate, level + 1);
    }
}
