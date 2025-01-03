package com.cookie.human_flavor_cookie.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cookie.human_flavor_cookie.member.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}


