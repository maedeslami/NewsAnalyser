package news.service;

import news.model.Mock;
import news.model.MockDto;
import news.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 8/25/2021.
 */
@Component
public class AnalyserServiceImpl implements AnalyserService {
    @Autowired
    private NewsRepository repository;

    @Override
    @Transactional
    public void receive(MockDto mockDto) throws InterruptedException {
        Mock mock = new Mock();
        //positive List
        List<String> positive = new ArrayList<>();
        positive.add("up");
        positive.add("good");
        positive.add("rise");
        positive.add("success");
        positive.add("high");
        positive.add("über");
        List<String> combination = mockDto.getHeadline();
        mock.setHeadline(String.valueOf(mockDto.getHeadline()));
        //check positive or not
        double percent = 100.0 * combination.stream().filter(positive::contains).count() / combination.size();
        if (percent > 50) {
            System.out.println("This message is Positive");
        }
        if (mockDto.getPriority() == 9 && percent > 50) {
            System.out.println("This message is more than 50% about a positive Things and contains this headline :" + combination + " and has prioity :" + mockDto.getPriority());
        }

    }
}
