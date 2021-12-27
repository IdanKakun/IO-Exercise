package com.idan.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputExercise {

    public static void main(String[] args) {
        String[] titles = {"Harry Pother", "Java", "Hurt"};
        float[] prices = {40.5f, 35f, 50.9f};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/idan kakun/Desktop/Buffer project/titles_to_prices.txt"));
            for (int i = 0; i < titles.length; i++) {
                writer.write(titles[i] + " - " + prices[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println(" An error occurred ");
        }
    }
}

