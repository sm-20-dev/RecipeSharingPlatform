package com.example.demo.repository;

import com.example.demo.model.Recipe;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
   //List<Recipe> findByNameContainingAndIngredientContainingAndCategoryContaining(String name, String ingredient, String category);
    List<Recipe> findByUser(User user);
}