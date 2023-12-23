package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

class Bookshelf {
    public static final int MAX_BOOKS = 10;
    private final Book[] books;
    private int countBooks;

    public Bookshelf() {
        books = new Book[MAX_BOOKS];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getFreeShelves() {
        return MAX_BOOKS - countBooks;
    }

    public void add(Book book) {
        if (countBooks == MAX_BOOKS) {
            System.out.println("Невозможно добавить книгу. Шкаф полон.");
            return;
        }

        books[countBooks] = book;
        countBooks++;

        System.out.println("Книга успешно добавлена.");
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                books[countBooks] = null;
                System.out.println("Книга успешно удалена.");
                return;
            }
        }
        System.out.println("Книга не найдена.");
    }

    public void clearShelf() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        System.out.println("Шкаф успешно очищен.");
    }
}