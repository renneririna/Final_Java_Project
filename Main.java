import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("HP", 8, 250, "Windows", "Черный"));
        notebooks.add(new Notebook("Asus", 16, 512, "Windows", "Серый"));
        notebooks.add(new Notebook("Lenovo", 32, 2000, "Windows", "Черный"));
        notebooks.add(new Notebook("Apple", 32, 512, "macOS", "Золотой"));
        notebooks.add(new Notebook("Apple", 64, 1000, "macOS", "Серебристый"));
        
        filterNotebook(notebooks);
    }

// создание критериев
    public static void filterNotebook(Set<Notebook> notebooks) {
        Map<String, String> criterion = new HashMap<>();
        criterion.put("1", "Брэнд");
        criterion.put("2", "ОЗУ");
        criterion.put("3", "Объем ЖД");
        criterion.put("4", "Операционная система");
        criterion.put("5", "Цвет");

        // запрос критерия у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        System.out.println("1 - Брэнд");
        System.out.println("2 - ОЗУ");
        System.out.println("3 - Объем ЖД");
        System.out.println("4 - Операционная система");
        System.out.println("5 - Цвет");
        String userInput = scanner.nextLine();

        if (criterion.containsKey(userInput)) {
            String selectedCriterion = criterion.get(userInput);
            System.out.println("ВВедите значение для критерия - " + selectedCriterion + ":");
            String minValue = scanner.nextLine();

            // сортировка ноутбуков по выбранному критерию
            Set<Notebook> filteredNotebook = new HashSet<>();
            switch (selectedCriterion) {
                case "Брэнд":
                    for (Notebook notebook : notebooks) {
                        if (notebook.getBrand().equalsIgnoreCase(minValue)) {
                            filteredNotebook.add(notebook);
                        }
                    }
                    break;

                case "ОЗУ":
                    int minRam = Integer.parseInt(minValue);
                    for (Notebook notebook : notebooks) {
                        if (notebook.getRam() >= minRam) {
                            filteredNotebook.add(notebook);
                        }
                    }
                    break;

                case "Объем ЖД":
                    int minhardDriveCapacity = Integer.parseInt(minValue);
                    for (Notebook notebook : notebooks) {
                        if (notebook.getHardDriveCapacity() >= minhardDriveCapacity) {
                            filteredNotebook.add(notebook);
                        }
                    }
                    break;

                case "Операционная система":
                    for (Notebook notebook : notebooks) {
                        if (notebook.getOs().equalsIgnoreCase(minValue)) {
                            filteredNotebook.add(notebook);
                        }
                    }
                    break;

                case "Цвет":
                    for (Notebook notebook : notebooks) {
                        if (notebook.getColor().equalsIgnoreCase(minValue)) {
                            filteredNotebook.add(notebook);
                        }
                    }
                    break;

                default:
                    System.out.println("Некорректный ввод критерия");
                    return;
            }
            // Вывод отсортированных ноутбуков
            if (filteredNotebook.isEmpty()) {
                System.out.println("Ноутбуки по запрошенным критериям не найдены");
            } else {
                for (Notebook notebook : filteredNotebook) {
                    System.out.println(notebook);
                }
            }
        } else {
            System.out.println("Некорректный ввод критерия");
        }
    }
}

