public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4; // Half of the diamond height (excluding the middle row)
        
        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/* 

a. What is the latest version of the Java SDK that is available?
Answer = The most recent version of the Java Standard Development Kit (JDK) is JDK 17.

b. What is the difference between Java SE and Java ME?
Answer: Java SE (Standard Edition) is the mainstream version of Java, providing a comprehensive set of libraries and APIs for desktop, server, and enterprise applications. It's used for developing applications on standard computers and workstations.
Java ME (Micro Edition) is a scaled-down version of Java tailored for resource-constrained devices like mobile phones and embedded systems. It offers a subset of Java SE features optimized for mobile application development and embedded environments.

c. Which operating system is Java available for?
Answer: Java is available for the following operating systems:
Windows: Versions 7, 8, 10, and 11.
Mac OS X: macOS x64 (10.7.3 and above) and macOS ARM64 (12 and above).
Linux: Various distributions like Redhat Linux, Ubuntu, CentOS, etc.
Solaris: Both SPARC (64-bit) and x64 versions.

d. What is the most popular IDE available for Java apart from Eclipse?
Answer: Apart from Eclipse, there are several other popular Java Integrated Development Environments (IDEs) that are useful:
IntelliJ IDEA: Widely used by developers, it offers advanced features, excellent code analysis, and a rich ecosystem of plugins.
NetBeans: An open-source IDE with a user-friendly interface, great for Java development and other languages.
BlueJ: Designed for beginners, it provides a simple environment for learning Java programming.
JDeveloper: Oracle’s IDE for Java EE development, especially suited for enterprise applications.
MyEclipse: Offers Java EE support and integrates with various tools for web and mobile development.

e. What is the main() function in a Java program?
Answer: The main() function in Java is the entry point for a program. It's where the execution starts. It must be declared as public static void main(String[] args). This method takes command-line arguments and contains the code to be executed when the program runs.

*/