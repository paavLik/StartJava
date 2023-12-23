package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

class Menu {
    private final Bookshelf bookshelf;
    private final Scanner scanner;

    public Menu() {
        bookshelf = new Bookshelf();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            displayBookshelf();
            showMenu();
            if (!executeOperation(scanner.nextLine())) {
                break;
            }
            waitForEnter();
        }
    }

    private void showMenu() {
        System.out.println("""
                Меню:
                1. Добавить книгу
                2. Удалить книгу
                3. Поиск книги
                4. Очистить шкаф
                5. Завершить
                Введите номер операции: """);
    }

    private boolean executeOperation(String choice) {
        switch (choice) {
            case "1":
                addBook();
                return true;
            case "2":
                deleteBook();
                return true;
            case "3":
                findBook();
                return true;
            case "4":
                clearShelf();
                return true;
            case "5":
                System.out.println("Программа завершена.");
                return false;
            default:
                System.out.println("Некорректный выбор. Попробуйте еще раз.");
                return true;
        }
    }

    private void addBook() {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        String title = inputTitle();

        System.out.print("Введите год издания книги: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        bookshelf.add(new Book(author, title, year));
    }

    private void deleteBook() {
        String title = inputTitle();
        bookshelf.delete(title);
    }

    private void findBook() {
        String title = inputTitle();
        Book foundBook = bookshelf.find(title);
        System.out.println(foundBook != null ? "Книга найдена: " + foundBook : "Книга не найдена.");
    }

    private void clearShelf() {
        bookshelf.clearShelf();
    }

    private void displayBookshelf() {
        if (bookshelf.getCountBooks() > 0) {
            System.out.println("В шкафу книг - " + bookshelf.getCountBooks() +
                    ", свободно полок - " + bookshelf.getFreeShelves());
            for (Book book : bookshelf.getBooks()) {
                System.out.println("|" + formatBookDisplay(book) + "|");
                System.out.println("|-----------------------------------------------------------|");
            }
        } else {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private String formatBookDisplay(Book book) {
        return String.format("%-60s", book.toString());
    }

    private String inputTitle() {
        System.out.print("Введите название книги: ");
        return scanner.nextLine();
    }

    private void waitForEnter() {
        System.out.print("Для продолжения нажмите Enter");
        scanner.nextLine();
    }
}