package com.trust.samrarthanam.DigitalLibrary.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.TextScore;

@Document(collection = "Books")
    public class Books {
        @Field("id")
        private String id;
        @Field("isbn")
        private String isbn;
        @Field("description")
        private String description;
        @Field("cloud_url")
        private String cloud_url;
        @Field("thumbNail")
        private String thumbNail;
        @Field("coverImg")
        private String coverImg;

        @Field("name")
        private String name;

        @Field("author")
        private String author;

        @Field("genre")
        private String genre;

    public Books() {
    }

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
        return "Books{" +
                "id='" + id + '\'' +
                ", isbn='" + isbn + '\'' +
                ", description='" + description + '\'' +
                ", cloud_url='" + cloud_url + '\'' +
                ", thumbNail='" + thumbNail + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}


