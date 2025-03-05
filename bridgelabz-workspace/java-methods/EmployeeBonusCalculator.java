import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; // [Salary, Years of Service]

        for (int i = 0; i < numEmployees; i++) {
            // Generate a random salary between 10000 and 99999 (5-digit salary)
            employeeData[i][0] = 10000 + random.nextInt(90000);
            // Generate random years of service between 1 and 10
            employeeData[i][1] = 1 + random.nextInt(10);
        }

        return employeeData;
    }

    // Method to calculate the bonus and new salary
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // [Old Salary, Bonus, New Salary]

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02; // 5% for >5 years, 2% for <=5 years
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonusAmount;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }

    // Method to display employee details in a tabular format
    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "Emp No.", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];

            System.out.printf("%-10d %-15.2f %-10.0f %-10.2f %-10.2f\n", 
                (i + 1), updatedData[i][0], employeeData[i][1], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-10s %-10.2f %-10.2f\n", "TOTAL", totalOldSalary, "-", totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonus(employeeData);
        displayResults(employeeData, updatedData);
    }
}