package com.startjava.lesson_2_3_4.bookshelf;

class Bookshelf {
    private int bookCount;
    private Book[] books;

    public Bookshelf() {
        bookCount = 0;
        books = new Book[10];
    }

    public void addBook(Book book) {
        if (bookCount == 10) {
            System.out.println("Невозможно добавить книгу. Шкаф полон.");
            return;
        }

        books[bookCount] = book;
        bookCount++;

        System.out.println("Книга успешно добавлена.");
    }

    public void findBook(String title) {
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Книга найдена: " + books[i].getInfo());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Книга не найдена.");
        }
    }

    public void deleteBook(String title) {
        boolean deleted = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                books[bookCount - 1] = null;
                bookCount--;

                System.out.println("Книга успешно удалена.");
                deleted = true;
                break;
            }
        }

        if (!deleted) {
            System.out.println("Книга не найдена.");
        }
    }

    public void displayShelf() {
        System.out.println("В шкафу книг - " + bookCount + ", свободно полок - " + (10 - bookCount));

        for (int i = 0; i < bookCount; i++) {
            System.out.println("|" + books[i].getInfo() + "|");
            System.out.println("|--------------------------------------------|");
        }

        for (int i = bookCount; i < 10; i++) {
            System.out.println("|                                            |");
            System.out.println("|--------------------------------------------|");
        }
    }

    public void clearShelf() {
        bookCount = 0;
        books = new Book[10];

        System.out.println("Шкаф успешно очищен.");
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getFreeShelves() {
        return 10 - bookCount;
    }
}

