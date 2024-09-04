package com.workintech.s19d2.repository;

import com.workintech.s19d2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("SELECT m FROM Member m WHERE m.email=:email") // JPQL
    Optional<Member> findByEmail(String email);
}
