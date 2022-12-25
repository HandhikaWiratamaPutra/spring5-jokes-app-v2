package guru.springframework.spring5jokesappv2.model;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class HWPChristmass {
    private List<String> quotes = Arrays.asList(
            "Merry Christmas and Happy New Year!",
            "Season's Greetings! And best wishes for the New Year.",
            "I hope your holiday is full of love, peace and joy!",
            "Merry Christmas! And best wishes for 2023.",
            "Merry Christmas! Wishing you all the happiness in the world.",
            "Wishing you peace and joy all season long. Happy Holidays!",
            "All I want for Christmas is you!",
            "I hope your Christmas is filled with laughter and prosperity.",
            "Happy Yummy Cookie Season! Hey, Santa isn’t the only one who enjoys a tasty, sweet treat.",
            "Santa told me you’ve been very good this year… I told him it was just a lack of opportunity. Merry Christmas!",
            "If a large man in red shows up to your door trying to gift wrap you, it's because you're on my Christmas wishlist! Merry Christmas to you!",
            "Dear Santa, just leave your credit card under the tree.",
            "Christmas is a time for family, food and fellowship. Wishing you nothing but the best that the season has to offer.",
            "Merry Christmas! This coming year, may you be gifted with countless blessings.",
            "This holiday season, may you and your family experience light and laughter.",
            "Gifts come and go, what really matters are the people who light up our lives all year long. Thank you!",
            "Sending lots of peace and joy to you and your family this Christmas season.",
            "May your life be filled with warmth and good cheer this holiday season and throughout the New Year.",
            "May this Christmas bring you many reasons to smile. Share this wonderful time of year with those near and dear to your heart."
    );

    public HWPChristmass() {
    }

    public String getRandomQuote() {
        return (String)this.quotes.get(ThreadLocalRandom.current().nextInt(0, this.quotes.size()));
    }

}
