package news.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import news.model.MockDto;
import news.service.AnalyserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lenovo on 8/25/2021.
 */
@RestController
public class AnalyserController {
    @Autowired
    AnalyserService analyserService;

    @PostMapping("/execute")
    public String receive(@RequestBody MockDto mockDto) throws InterruptedException {
         analyserService.receive(mockDto);
      return "Receive" ;
    }
}
