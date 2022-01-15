package blockchain.Services;


import blockchain.Entities.Transaction;
import org.springframework.stereotype.Service;

@Service
public interface TransactionService {
    public void signTransaction(Transaction transaction);
}

