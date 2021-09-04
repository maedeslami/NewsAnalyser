package news.service;


import news.model.MockDto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Lenovo on 8/25/2021.
 */
@Component
public class AnalyserServiceImpl implements AnalyserService {
    int counter = 0;
    @Override
    public void receive(MockDto mockDto) throws InterruptedException {
        //positive List
        List<String> positive = new ArrayList<>();
        positive.add("up");
        positive.add("good");
        positive.add("rise");
        positive.add("success");
        positive.add("high");
        positive.add("über");
        List<String> combination = mockDto.getHeadline();
        //check headline is unique or not : see if the Set has the same size as the combination.
        Set<String> set = new HashSet<String>(combination);
        //check positive or not
        double percent = 100.0 * combination.stream().filter(positive::contains).count() / combination.size();

        if (percent > 50) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("Showing The Positive News : This message with headline: " + mockDto.getHeadline() + "is Positive");
            System.out.println("-----------------------------------------------------------------------------------------");

            counter++;
            Thread.sleep(10000);
            System.out.println("The count of positive News During Last 10 seconds :  " + counter);
            //maximum 3 positive news with  unique headline
            if (mockDto.getPriority() == 9 && set.size() == combination.size() && counter <= 3) {
                System.out.println("This message is more than 50% about a positive Things and contains this unique headline :" + combination);
            }
            counter = 0;
            //Interesting news
            if (mockDto.getPriority() == 9) {
                System.out.println("Interesting news :This message is more than 50% positive and contains this headline :" + mockDto.getPriority() + "  and has highest priority");
            }
        }

    }


}
