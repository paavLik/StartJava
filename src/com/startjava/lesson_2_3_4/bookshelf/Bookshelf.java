package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

class Bookshelf {
    private static final int MAX_BOOKS = 10;
    private final Book[] books;
    private int countBook;

    public Bookshelf() {
        books = new Book[MAX_BOOKS];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBook);
    }

    public int getCountBook() {
        return countBook;
    }

    public int getFreeShelves() {
        return MAX_BOOKS - countBook;
    }

    public void add(Book book) {
        if (countBook == 10) {
            System.out.println("Невозможно добавить книгу. Шкаф полон.");
            return;
        }

        books[countBook] = book;
        countBook++;

        System.out.println("Книга успешно добавлена.");
    }

    public Book find(String title) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < countBook; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                countBook--;
                System.arraycopy(books, i + 1, books, i, countBook - i);
                books[countBook] = null;
                System.out.println("Книга успешно удалена.");
                return;
            }
        }
        System.out.println("Книга не найдена.");
    }

    public void clearShelf() {
        Arrays.fill(books, 0, countBook, null);
        countBook = 0;
        System.out.println("Шкаф успешно очищен.");
    }
}

