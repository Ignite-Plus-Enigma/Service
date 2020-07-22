package com.trust.samrarthanam.DigitalLibrary.Service;

import com.trust.samrarthanam.DigitalLibrary.Model.Books;
import com.trust.samrarthanam.DigitalLibrary.dao.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class BookService {
    @Autowired
    private BooksRepo booksRepo;


    public List<Books> listBooks() {
        return (List<Books>) booksRepo.findAll();

    }

    @Autowired
    MongoTemplate mongoTemplate;

    public Collection searchBooks(String text) {
        return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("isbn").regex(text, "i"),
                        Criteria.where("name").regex(text, "i"),
                        Criteria.where("author").regex(text, "i"),
                        Criteria.where("genre").regex(text, "i")
                            )
        ), Books.class);
    }
    }

