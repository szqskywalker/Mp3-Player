package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

public class Song_Queue {
    static String song1filepath = "D:\\D drive essentials from Marconi\\Downloads\\Arnold Schwarzenegger This Speech Broke The Internet AND Most Inspiring Speech- It Changed My Life..mp3";
    static String song2filepath = "D:\\D drive essentials from Marconi\\Downloads\\WORK ETHIC - Best Motivational Video.mp3";
    static String song3filepath = "D:\\D drive essentials from Marconi\\Downloads\\The Most Eye Opening 10 Minutes Of Your Life  David Goggins.mp3";
    static String song4filepath = "D:\\D drive essentials from Marconi\\Downloads\\IVE COME TOO FAR TO QUIT - Best Motivational Video.mp3";
    static ObservableList<String> queue = FXCollections.observableArrayList(song1filepath,song2filepath,song3filepath,song4filepath);

    public static void addToQueue(String element) {
        queue.add(element);
    }
    public static void traverse() {
        for (String traversal : queue) {
            System.out.println(traversal);
        }
    }
    public static void removeFromQueue(int index1,int index2) {
        queue.remove(index1,index2);
    }
    public static void swapSongElements(int index1, int index2) {
        Collections.swap(queue, index1,index2);
    }


    public static void main(String args[]) {
        System.out.println("==============================================");
        traverse();
        removeFromQueue(1,2);
        System.out.println("==============================================");
        traverse();
        System.out.println("==============================================");
        traverse();
    }
    //delete,add,traverse,swap,
    /*
    list1
    list2 -> list3
    list3 -> list2
    list4
     */
}
