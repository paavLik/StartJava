package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

class Menu {
    private final Bookshelf bookshelf;

    public Menu() {
        bookshelf = new Bookshelf();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            if (bookshelf.getCountBook() > 0) {
                displayShelf();
            } else {
                System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            }
            showMenu();
            continueRunning = executeOperation(scanner.nextLine(), scanner);
        }
    }

    private void showMenu() {
        String menuText = """
                Меню:
                1. Добавить книгу
                2. Удалить книгу
                3. Поиск книги
                4. Очистить шкаф
                5. Завершить
                Введите номер операции: """;
        System.out.println(menuText);
    }

    private boolean executeOperation(String choice, Scanner scanner) {
        switch (choice) {
            case "1":
                addBook(scanner);
                break;
            case "2":
                deleteBook(scanner);
                break;
            case "3":
                findBook(scanner);
                break;
            case "4":
                clearShelf();
                break;
            case "5":
                System.out.println("Программа завершена.");
                return false;
            default:
                System.out.println("Некорректный выбор. Попробуйте еще раз.");
                break;
        }

        System.out.print("Для продолжения нажмите Enter");
        scanner.nextLine();
        return true;
    }


    private void addBook(Scanner scanner) {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        String title = requestTitle(scanner);

        System.out.print("Введите год издания книги: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(author, title, year);
        bookshelf.add(book);
    }

    private void deleteBook(Scanner scanner) {
        String title = requestTitle(scanner);
        bookshelf.delete(title);
    }

    private void findBook(Scanner scanner) {
        String title = requestTitle(scanner);
        Book foundBook = bookshelf.find(title);
        if (foundBook != null) {
            System.out.println("Книга найдена: " + foundBook);
        } else {
            System.out.println("Книга не найдена.");
        }
    }

    public void clearShelf() {
        bookshelf.clearShelf();
    }

    private void displayShelf() {
        System.out.println("В шкафу книг - " + bookshelf.getCountBook() + ", свободно полок - " + bookshelf.getFreeShelves());
        for (int i = 0; i < bookshelf.getCountBook(); i++) {
            System.out.println("|" + formatBookDisplay(bookshelf.getBooks()[i]) + "|");
            System.out.println("|-----------------------------------------------------------|");
        }
    }

    private String formatBookDisplay(Book book) {
        return String.format("%-60s", book.toString());
    }

    private String requestTitle(Scanner scanner) {
        System.out.print("Введите название книги: ");
        return scanner.nextLine();
    }
}