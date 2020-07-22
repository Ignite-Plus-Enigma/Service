package com.trust.samrarthanam.DigitalLibrary.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.TextScore;

@Document(collection = "books")
    public class Books {
        @Id
        @Field("id")
        private String id;
        @Field("isbn")
        private String isbn;

        @Field("name")
        private String name;

        @Field("author")
        private String author;

        @Field("genre")
        private String genre;

        public String getId() {
            return id;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getName() {
            return name;
        }

        public String getAuthor() {
            return author;
        }

        public String getGenre() {
            return genre;
        }

        @Override
            public String toString() {
                return "\n Book{" +" isbn=" + isbn + " ,name=" + name + " ,author=" + author + " ,genre=" + genre +"}\n";
            }

        }


