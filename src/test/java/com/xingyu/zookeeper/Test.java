package com.xingyu.zookeeper;

import com.xingyu.zookeeper.util.ZkApi;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yangxingyu
 * @date 2019/12/27
 * @description
 */

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private ZkApi zkApi;

    @org.junit.Test
    public void test1(){
        zkApi.createNode("/zookeeper/nddodde","test");
    }

}
