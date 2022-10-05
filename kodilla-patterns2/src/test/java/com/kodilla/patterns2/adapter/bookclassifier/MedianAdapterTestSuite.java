package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author X", "Title 1" , 1998, "00012");
        Book book2 = new Book("Author Y", "Title 2" , 2017, "00013");
        Book book3 = new Book("Author Z", "Title 3" , 1982, "00033");
        Book book4 = new Book("Author A", "Title 4" , 2001, "00076");
        Book book5 = new Book("Author B", "Title 5" , 1966, "00900");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(median);
        //Then
        assertEquals(1998, median);
    }
}
