package WiseWillow.io.Quotes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class QuotesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuotesApplication.class, args);
	}

	@Autowired
	private QuoteRepo quoteRepo;

	@Override
	public void run(String... args) throws Exception {
		List<Quote> quotes = new ArrayList<>();
		quotes.add(new Quote("The purpose of a storyteller is not to tell you how to think, but to give you questions to think upon."));
		quotes.add(new Quote("In the end, all men die. How you lived will be far more important to the Almighty than what you accomplished."));
		quotes.add(new Quote("To lack feeling is to be dead, but to act on every feeling is to be a child"));
		quotes.add(new Quote("Expectations were like fine pottery. The harder you held them, the more likely they were to crack."));
		quotes.add(new Quote("Sometimes the prize is not worth the costs. The means by which we achieve victory are as important as the victory itself."));
		quotes.add(new Quote("Too many of us take great pains with what we ingest through our mouths, and far less with what we partake of through our ears and eyes."));
		quotes.add(new Quote("An excuse is what you make after the deed is done, while a justification is what you offer before."));
		quotes.add(new Quote("In the end, I must proclaim that no good can be achieved of false means. For the substance of our existence is not in the achievement, but in the method."));
		quotes.add(new Quote("A man’s emotions are what define him, and control is the hallmark of true strength. To lack feeling is to be dead, but to act on every feeling is to be a child."));
		quotes.add(new Quote("The mark of a great man is one who knows when to set aside the important things in order to accomplish the vital ones."));
		quotes.add(new Quote("You see, that is the sad, sorry, terrible thing about sarcasm. It’s really funny."));
		quotes.add(new Quote("Expectation wasn’t just about what people expected of you. It was about what you expected of yourself."));

	quoteRepo.saveAll(quotes);
	}
}
