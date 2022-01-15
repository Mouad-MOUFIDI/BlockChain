package blockchain.Controller;


import blockchain.Repositories.TransactionRepository;
import blockchain.Entities.Block;
import blockchain.Entities.BlockChain;
import blockchain.Entities.Transaction;
import blockchain.Repositories.BlockChaineRepository;
import blockchain.Repositories.TransactionRepository;
import blockchain.Services.BlockService;
import blockchain.Services.BlockchainService;
import blockchain.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;


@RestController
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository ;
    @Autowired
    private BlockchainService blockchainService;
    @Autowired
    private BlockService blockService;
    @Autowired
    private BlockChaineRepository blockChaineRepository;
    @Autowired
    TransactionService transactionService;


    @PostMapping("/sign")
    public void sign(@RequestBody Transaction transaction){
        transactionService.signTransaction(transaction);
    }

    @GetMapping("/mine/{id}")
    public Block mine(@PathVariable String id) throws NoSuchAlgorithmException {
        BlockChain blockChain = blockChaineRepository.findById(id).get();
        Block blockMiner = blockService.mining(blockChain);
        Block block = blockchainService.minerBlock(null,blockMiner,blockChain);
        transactionRepository.deleteAll();
        return block;
    }


}
