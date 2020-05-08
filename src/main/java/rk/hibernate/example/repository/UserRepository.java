package rk.hibernate.example.repository;

import org.springframework.stereotype.Repository;

import rk.hibernate.example.entity.User;

@Repository
public interface UserRepository extends BaseRepository<User, Long>
{


}
