package com.gcu.bussiness;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsInterface extends JpaRepository<ItemTable, Integer> {
	@Query("SELECT u FROM ItemTable u WHERE u.itemName = ?1")
	public ItemTable findByname(String itemName);

}
