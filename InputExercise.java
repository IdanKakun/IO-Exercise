package com.idan.input;

import com.idan.input.model.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputExercise {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/idan kakun/Desktop/Buffer project/titles_to_prices.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                String title = "";
                char ch = line.charAt(index);
                while (ch != '-') {
                    title += ch;
                    index++;
                    ch = line.charAt(index);

                }
                index++;
                String price = "";
                while (index < line.length()) {
                    ch = line.charAt(index);
                    price += ch;
                    index++;
                }

                books.add(new Book(title, Float.parseFloat(price)));
            }
            for (Book book : books) {
                System.out.println(book);
            }

        } catch (IOException e) {
            System.err.println("An error occurred");
        }
    }
}


