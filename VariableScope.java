// File Naming Convention: VariableScope.java

public class VariableScope {
    // Declare the global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the globalCount in main
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        int localCount = 50; // Declare a local variable
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
