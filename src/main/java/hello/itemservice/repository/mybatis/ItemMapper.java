package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {
    void save(Item item);

    // 파라미터가 하나인 경우에는 @Param 안붙여도 되지만
    // 두개 이상인 경우엔 @Param 반드시 붙여 줘야 함
    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);
}
