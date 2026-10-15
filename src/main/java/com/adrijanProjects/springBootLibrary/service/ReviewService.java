package com.adrijanProjects.springBootLibrary.service;

import com.adrijanProjects.springBootLibrary.entity.Review;
import org.springframework.data.domain.Page;

public interface ReviewService {
    Page<Review> getReviewsByBookId(Long bookId, int pageNo, int pageSize);
}
