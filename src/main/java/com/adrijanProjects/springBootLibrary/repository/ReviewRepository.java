package com.adrijanProjects.springBootLibrary.repository;

import com.adrijanProjects.springBootLibrary.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query("Select AVG(r.rating) from Review r where r.bookId=:bookId")
    Double findAverageRatingByBookId(@Param("bookId") Long bookId);

     Page<Review> findByBookId(Long bookId, Pageable pageable);

    boolean existsByUserEmailAndBookId(String userEmail, Long bookId);
}
