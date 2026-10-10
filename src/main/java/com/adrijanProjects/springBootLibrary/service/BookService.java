package com.adrijanProjects.springBootLibrary.service;

import com.adrijanProjects.springBootLibrary.entity.Book;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BookService {

    Page<Book> getAllBooks(int pageNo,int pageSize);

}
