/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.config.DBConnect;
import model.entity.Food;
import model.entity.Pet;
import static model.repository.ProductRepository.listPet;

/**
 *
 * @author PC
 */
public class ProductRepository {

    public static ArrayList<Pet> listPet() {
        ArrayList<Pet> listPet = new ArrayList<Pet>();
        try {
            String query = "select * from tblPet";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                String productId = results.getString(1);
                String productName = results.getString(2);
                String petColor = results.getString(3);
                String productType = results.getString(4);
                double productPrice = results.getDouble(5);
                int productAmount = results.getInt(6);
                Pet pet = new Pet(productId, productName, productType, productPrice, productAmount, petColor);
                listPet.add(pet);
            }
        } catch (Exception e) {
            System.err.println("Loi database method listPet class ProductRepository");
        }
        return listPet;
    }
    public static ArrayList<Pet> listDog(){
         ArrayList<Pet> listPet = new ArrayList<Pet>();
        try {
            String query = "select * from tblPet where PetType='dog'";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                String productId = results.getString(1);
                String productName = results.getString(2);
                String petColor = results.getString(3);
                String productType = results.getString(4);
                double productPrice = results.getDouble(5);
                int productAmount = results.getInt(6);
                Pet pet = new Pet(productId, productName, productType, productPrice, productAmount, petColor);
                listPet.add(pet);
            }
        } catch (Exception e) {
            System.err.println("Loi database method listDog class ProductRepository");
        }
        return listPet;
    }
    public static ArrayList<Pet> listCat(){
         ArrayList<Pet> listPet = new ArrayList<Pet>();
        try {
            String query = "select * from tblPet where PetType='cat'";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                String productId = results.getString(1);
                String productName = results.getString(2);
                String petColor = results.getString(3);
                String productType = results.getString(4);
                double productPrice = results.getDouble(5);
                int productAmount = results.getInt(6);
                Pet pet = new Pet(productId, productName, productType, productPrice, productAmount, petColor);
                listPet.add(pet);
            }
        } catch (Exception e) {
            System.err.println("Loi database method listDog class ProductRepository");
        }
        return listPet;
    }

    public static ArrayList<Food> listFood() {
        ArrayList<Food> listFood = new ArrayList<Food>();
        try {
            String query = "select * from tblFood";
            Connection con = DBConnect.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            while (results.next()) {
                String productId = results.getString(1);
                String productName = results.getString(2);
                String productType = results.getString(3);
                double productPrice = results.getDouble(4);
                int productAmount = results.getInt(5);
                Food food = new Food(productId, productName, productType, productPrice, productAmount);
                listFood.add(food);
            }
        } catch (Exception e) {
            System.err.println("Loi database method listFood class ProductRepository");
        }
        return listFood;
    }

    public static void main(String[] args) {
//                ArrayList<Pet> listPet = listPet();
//                for (Pet pet : listPet) {
//                    System.out.println(pet);
//            
//        }
//                System.out.println(listPet.size());
//        ArrayList<Food> listFood = listFood();
//        for (Food food : listFood) {
//            System.out.println(food);
//
//        }
//        System.out.println(listFood.size());
                
    }
}
