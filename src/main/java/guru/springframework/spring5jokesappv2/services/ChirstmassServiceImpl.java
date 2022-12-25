package guru.springframework.spring5jokesappv2.services;

import guru.springframework.spring5jokesappv2.model.HWPChristmass;
import org.springframework.stereotype.Service;

@Service
public class ChirstmassServiceImpl implements ChirstmassService {

    private final HWPChristmass hwpChristmass;

    public ChirstmassServiceImpl() {
        this.hwpChristmass = new HWPChristmass();
    }

    @Override
    public String getMessage() {
        return hwpChristmass.getRandomQuote();
    }
}
