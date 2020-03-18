package com.interview.sde.challenge.service;

import com.interview.sde.challenge.service.impl.MovingAverageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@Slf4j
public class MovingAverageServiceTest {

    private MovingAverageService movingAverageService;

    @Before
    public void setup() {
        movingAverageService = new MovingAverageServiceImpl();
        Assert.assertNotNull(movingAverageService);
    }

    @Test
    public void test() {
        float value = movingAverageService.getAverageOfLastN(4);
        Assert.assertTrue(value == 0);
        movingAverageService.addElement(Float.valueOf(1));
        movingAverageService.addElement(Float.valueOf(2));
        movingAverageService.addElement(Float.valueOf(3));
        for(Float f : movingAverageService.getAllElements()) {
            log.info(f.toString() + "-------------");
        }
        movingAverageService.addElement(Float.valueOf(4));
        movingAverageService.addElement(Float.valueOf(5));
        movingAverageService.addElement(Float.valueOf(6));
        movingAverageService.addElement(Float.valueOf(7));
        movingAverageService.addElement(Float.valueOf(8));
        movingAverageService.addElement(Float.valueOf(9));

        float value1 = movingAverageService.getAverageOfLastN(4);
        Assert.assertTrue(value1 == 7.5);
        float value2 = movingAverageService.getAverageOfLastN(10);
        Assert.assertTrue(value2 == 4.5);

    }

}
