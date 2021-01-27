package com.xiao.dao;

import com.xiao.pojo.Books;
import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    int addBook(Books book);

    int deleteBookById(@Param("bookId") int id);

    Books queryBookById(int id);

    int updateBook(Books book);

    //@Select({})
    List<Books> queryAllBooks();

}
