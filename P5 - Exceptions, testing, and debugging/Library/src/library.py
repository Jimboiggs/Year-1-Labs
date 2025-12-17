global books
books = {}
global borrowed_books
borrowed_books = {}


def borrow_book(book_name: str):
    if book_name not in books:
        raise ValueError("Book not found in the library.")
    elif books[book_name] < 1:
        raise RuntimeError("No copies available for borrowing.")

    books[book_name] -= 1

    if book_name not in borrowed_books:
        borrowed_books[book_name] = 1
    else:
        borrowed_books[book_name] += 1

    print("Borrowed '" + book_name + "'.")


def return_book(book_name: str):
    if book_name not in borrowed_books:
        raise RuntimeError("This book was not borrowed.")
    books[book_name] += 1
    if borrowed_books[book_name] > 1:
        borrowed_books[book_name] -= 1
    else:
        del borrowed_books[book_name]

    print("Returned '" + book_name + "'.")
