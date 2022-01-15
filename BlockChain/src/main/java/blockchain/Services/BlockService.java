package blockchain.Services;



import blockchain.Entities.Block;
import blockchain.Entities.BlockChain;

import java.security.NoSuchAlgorithmException;

public interface BlockService  {

    public Block createBlock() throws NoSuchAlgorithmException;
    public String calculHashBlock(Block block) throws NoSuchAlgorithmException;
    public Block mining(BlockChain blockChain) throws NoSuchAlgorithmException;

}
