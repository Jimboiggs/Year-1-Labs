import pytest

from library import *


def test_borrow_book():
    global books
    global borrowed_books
    books = {"Textbook", 2}
    borrow_book("Textbook")
    assert books["Textbook"] == 1


def test_borrow_book_not_found():
    global books
    global borrowed_books
    books = {}
    with pytest.raises(KeyError):
        borrow_book("Textbook")


def test_return_book():
    global books
    global borrowed_books
    borrowed_books = {"Textbook", 2}
    return_book("Textbook")
    assert borrowed_books == {"Textbook", 1}


def test_return_book_not_borrowed():
    global books
    global borrowed_books
    borrowed_books = {}
    with pytest.raises(KeyError):
        return_book("Textbook")
