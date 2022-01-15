package blockchain.Repositories;


import blockchain.Entities.BlockChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BlockChaineRepository extends JpaRepository<BlockChain,String> {
}
