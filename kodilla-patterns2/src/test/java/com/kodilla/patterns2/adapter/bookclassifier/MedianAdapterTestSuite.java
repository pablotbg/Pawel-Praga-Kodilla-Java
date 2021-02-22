package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author_test1", "Title_test1", 1991, "test1"));
        bookSet.add(new Book("Author_test2", "Title_test2", 1998, "test2"));
        bookSet.add(new Book("Author_test3", "Title_test3", 2010, "test3"));
        //When
        MedianAdapter adapter = new MedianAdapter();
        int medianPublicationYear = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1998, medianPublicationYear);
    }
}
