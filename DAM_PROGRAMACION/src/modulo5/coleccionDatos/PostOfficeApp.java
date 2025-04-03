package modulo5.coleccionDatos;


import java.util.*;

public class PostOfficeApp {

    private static final Map<String, String> users = new HashMap<>(); // Stores username and password
    private static final List<Package> packageList = new ArrayList<>(); // Stores package data
    private static final Queue<Long> clientQueue = new LinkedList<>(); // FIFO queue for client actions

    
    public PostOfficeApp() {
        // Predefined users
        users.put("admin", "admin123"); // Admin credentials
        users.put("client", ""); // Placeholder for client password (idpackage)
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Post Office System");

        while (true) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (users.containsKey(username) && users.get(username).equals(password)) {
                if (username.equals("admin")) {
                    adminMenu(scanner);
                } else {
                    clientMenu(scanner);
                }
            } else {
                System.out.println("Invalid credentials. Try again.");
            }
        }
    }

    private void adminMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add package");
            System.out.println("2. Remove package");
            System.out.println("3. Call next client");
            System.out.println("4. Logout");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addPackage(scanner);
                case 2 -> removePackage(scanner);
                case 3 -> callNextClient();
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private  void clientMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nClient Menu:");
            System.out.println("1. Send package");
            System.out.println("2. Pick up package");
            System.out.println("3. Logout");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> sendPackage(scanner);
                case 2 -> pickUpPackage(scanner);
                case 3 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private  void addPackage(Scanner scanner) {
        System.out.print("Enter package ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        if (packageList.stream().anyMatch(pkg -> pkg.id.equals(id))) {
            System.out.println("Error: Package ID already exists.");
            return;
        }

        System.out.print("Enter weight: ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter sender: ");
        String sender = scanner.nextLine();
        System.out.print("Enter receiver: ");
        String receiver = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter date shipped: ");
        String dateShipped = scanner.nextLine();
        System.out.print("Enter pick-up date: ");
        String pickUpDate = scanner.nextLine();

        packageList.add(new Package(id, weight, height, width, sender, receiver, address, dateShipped, pickUpDate));
        System.out.println("Package added successfully.");
    }

    private  void removePackage(Scanner scanner) {
        System.out.print("Enter package ID to remove: ");
        Long id = Long.parseLong(scanner.nextLine());

        if (packageList.removeIf(pkg -> pkg.id.equals(id))) {
            System.out.println("Package removed successfully.");
        } else {
            System.out.println("Error: Package ID not found.");
        }
    }

    private  void callNextClient() {
        if (clientQueue.isEmpty()) {
            System.out.println("No clients in the queue.");
            return;
        }

        Long nextClientId = clientQueue. poll();
        System.out.println("Calling client with package ID: " + nextClientId);
    }

    private  void sendPackage(Scanner scanner) {
        System.out.print("Enter package ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        if (packageList.stream().anyMatch(pkg -> pkg.id.equals(id))) {
            System.out.println("Error: Package ID already exists.");
            return;
        }

        clientQueue.add(id);

        users.put("client", id.toString());

        System.out.print("Enter weight: ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter sender: ");
        String sender = scanner.nextLine();
        System.out.print("Enter receiver: ");
        String receiver = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter date shipped: ");
        String dateShipped = scanner.nextLine();
        System.out.print("Enter pick-up date: ");
        String pickUpDate = scanner.nextLine();

        packageList.add(new Package(id, weight, height, width, sender, receiver, address, dateShipped, pickUpDate));
        System.out.println("Package sent successfully and added to the system.");
    }

    private  void pickUpPackage(Scanner scanner) {
        System.out.print("Enter package ID to pick up: ");
        Long id = Long.parseLong(scanner.nextLine());

        if (packageList.removeIf(pkg -> pkg.id.equals(id))) {
            System.out.println("Package picked up successfully.");
        } else {
            System.out.println("Error: Package ID not found.");
        }
    }
}

