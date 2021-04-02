package com.xxll.test.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xxll
 * @date 2021年04月02日17:53
 * @package com.xxll.test.concurrenthashmap
 */
public class Test {

    public static void main(String[] args) {

        ConcurrentHashMap<String,Double> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("k1",0.1);
        concurrentHashMap.put("k2",0.2);
        concurrentHashMap.put("k3",0.3);
        concurrentHashMap.put("k4",0.4);


    }

}
