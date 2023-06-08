package com.mfly.sdjpaintro.repositories;

import com.mfly.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
