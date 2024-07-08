package br.dev.tiagogomes.btgpactual.orderms.repository;

import br.dev.tiagogomes.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

	Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
