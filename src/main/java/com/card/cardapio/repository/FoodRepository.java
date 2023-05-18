package com.card.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.card.cardapio.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
