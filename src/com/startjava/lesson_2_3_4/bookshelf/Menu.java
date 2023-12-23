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
        boolean continueRunning = true;

        while (continueRunning) {
            displayShelf();
            System.out.println("""
                    Меню:
                    1. Добавить книгу
                    2. Удалить книгу
                    3. Поиск книги
                    4. Очистить шкаф
                    5. Завершить
                    Введите номер операции: """);
            continueRunning = executeOperation(scanner.nextLine());
        }
    }

    public void addBook() {
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        String title = inputTitle();

        System.out.print("Введите год издания книги: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер после ввода числа

        bookshelf.add(new Book(author, title, year));
        waitForEnter();
    }

    public void deleteBook() {
        String title = inputTitle();
        bookshelf.delete(title);
        waitForEnter();
    }

    public void findBook() {
        String title = inputTitle();
        Book foundBook = bookshelf.find(title);
        System.out.println(foundBook != null ? "Книга найдена: " + foundBook : "Книга не найдена.");
        waitForEnter();
    }

    public void clearShelf() {
        bookshelf.clearShelf();
        waitForEnter();
    }

    private boolean executeOperation(String choice) {
        return switch (choice) {
            case "1" -> {
                addBook();
                yield true;
            }
            case "2" -> {
                deleteBook();
                yield true;
            }
            case "3" -> {
                findBook();
                yield true;
            }
            case "4" -> {
                clearShelf();
                yield true;
            }
            case "5" -> {
                System.out.println("Программа завершена.");
                yield false;
            }
            default -> {
                System.out.println("Некорректный выбор. Попробуйте еще раз.");
                yield true;
            }
        };
    }

    private void displayShelf() {
        if (bookshelf.getCountBooks() > 0) {
            System.out.println("В шкафу книг - " + bookshelf.getCountBooks() +
                    ", свободно полок - " + bookshelf.getFreeShelves());
            for (int i = 0; i < bookshelf.getCountBooks(); i++) {
                System.out.println("|" + formatBookDisplay(bookshelf.getBooks()[i]) + "|");
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