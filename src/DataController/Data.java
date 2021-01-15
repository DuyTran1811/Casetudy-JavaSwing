/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataController;

import java.util.List;

/**
 *
 * @author turtle
 */
public interface Data {

    String CARFILE = "FileCar.txt";

    <T> void WriterToFile(List<T> data, String fileName);

    <T> List <T> ReadDataFromFile(String fileName);
}
