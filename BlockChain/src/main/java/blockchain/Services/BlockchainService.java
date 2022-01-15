package blockchain.Services;


import blockchain.Entities.Block;
import blockchain.Entities.BlockChain;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public interface BlockchainService {
    public BlockChain createBlockchain(String nom , int difficulty, double rewards);
    public Block minerBlock(String address_mineur, Block block, BlockChain blockChain) throws NoSuchAlgorithmException;
    public Block getLastBlock(BlockChain blockChain);
    public boolean blockchianeValide();
}
