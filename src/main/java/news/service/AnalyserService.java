package news.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import news.model.Mock;
import news.model.MockDto;

/**
 * Created by Lenovo on 8/25/2021.
 */
public interface AnalyserService {
    void receive(MockDto mockDto) throws InterruptedException;
}
