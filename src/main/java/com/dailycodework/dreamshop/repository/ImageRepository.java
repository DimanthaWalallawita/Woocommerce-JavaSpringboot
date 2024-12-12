package com.dailycodework.dreamshop.repository;

import com.dailycodework.dreamshop.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
