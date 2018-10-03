package com.security.cryptoproject.repository;

import com.security.cryptoproject.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public UserEntity findByEmail(String email) {
        return null;
    }

    @Override
    public <S extends UserEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends UserEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<UserEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<UserEntity> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
    }

    @Override
    public void delete(UserEntity userEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
