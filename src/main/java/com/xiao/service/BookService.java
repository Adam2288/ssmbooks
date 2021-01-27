package com.xiao.service;

import com.xiao.pojo.Books;
import java.util.List;

public interface BookService {

    int addBook(Books book);

    int deleteBookById(int id);

    Books queryBookById(int id);

    int updateBook(Books book);

    List<Books> queryAllBooks();
}
