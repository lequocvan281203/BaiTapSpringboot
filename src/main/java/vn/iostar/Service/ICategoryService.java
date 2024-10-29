package vn.iostar.Service;

import vn.iostar.Entity.CategoryEntity;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    <S extends CategoryEntity> S save(S entity);
    <S extends CategoryEntity> Optional<S> findOne(Example<S> example);
    List<CategoryEntity> findAll();
    Page<CategoryEntity> findAll(Pageable pageable);
    List<CategoryEntity> findAllById(Iterable<Long> ids);
    List<CategoryEntity> findAll(Sort sort);
    Optional<CategoryEntity> findById(Long id);
    long count();
    void deleteById(Long id);
    void delete(CategoryEntity entity);
    void deleteAll();
    List<CategoryEntity> findByNameContaining(String name);
    Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
}
