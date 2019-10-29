package WiseWillow.io.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping(value = "/findAll")
    public List<Quote> findAll() {
        return quoteService.findAll();
    }

    @GetMapping(value = "/random")
    public Quote findOneRandomQuote() {
        return quoteService.getRandomQuote();
    }
}
