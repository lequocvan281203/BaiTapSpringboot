package vn.iostar.Repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.iostar.Entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    // Tìm kiếm theo nội dung tên
    List<CategoryEntity> findByNameContaining(String name);

    // Tìm kiếm và phân trang
    Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);
}
