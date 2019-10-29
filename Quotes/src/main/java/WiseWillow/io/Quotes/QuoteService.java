package WiseWillow.io.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepo quoteRepo;

    public List<Quote> findAll() {
        return quoteRepo.findAll();
    }

    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepo.findAll();
        Random rand = new Random();
        return quotes.get(rand.nextInt(quotes.size()));
    }
}
