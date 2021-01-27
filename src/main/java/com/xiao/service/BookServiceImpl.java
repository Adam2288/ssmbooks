package com.xiao.service;

import com.xiao.pojo.Books;
import java.util.List;
import com.xiao.dao.BookMapper;

public class BookServiceImpl implements BookService {
    //service层调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books book) {
        bookMapper.addBook(book);
        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        bookMapper.deleteBookById(id);
        return 0;
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        bookMapper.updateBook(book);
        return 0;
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
