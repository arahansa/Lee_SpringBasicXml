package com.exmaple.plain;

import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class EqualsTest {

	static final  long times = 9000000000l;
	static final String testString = "";
	
	@Test
	public void 이퀄시간체크테스트() throws Exception {
		long before = System.currentTimeMillis();
        int j=0;
        for(long i=0;i<times;i++)
            if(StringUtils.equals(testString, ""))
                j++;
        long after = System.currentTimeMillis();
        System.out.println("스트링유틸 " + " 걸린 시간 :"+ (after-before));
	}
	
	@Test
	public void 이퀄시간체크테스트2() throws Exception {
		long before = System.currentTimeMillis();
        int j=0;
        for(long i=0;i<times;i++)
            if("".equals(testString))
                j++;
        long after = System.currentTimeMillis();
        System.out.println("일반 이퀄" + " 걸린 시간 :"+ (after-before));
	}
}
