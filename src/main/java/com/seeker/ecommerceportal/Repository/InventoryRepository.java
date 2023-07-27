package com.seeker.ecommerceportal.Repository;

import com.seeker.ecommerceportal.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    @Query("select s from Inventory s  where s.item.item_id = ?1")
    Inventory findByItemId(Long itemId);
}
