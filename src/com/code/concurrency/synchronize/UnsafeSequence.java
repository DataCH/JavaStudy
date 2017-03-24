package com.code.concurrency.synchronize;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by car on 2017/3/23.
 */
public class UnsafeSequence {

    private static Integer count = 0;

    private static final Integer sequenceLength = 5;

    public static String getSequence() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateStr = sdf.format(new Date());
        return dateStr + getCountSequence();
    }

    private static String getCountSequence() {
        count += 1;
        String countStr = String.valueOf(count);
        StringBuilder sb = new StringBuilder();
        Integer zerosLength = sequenceLength - countStr.length();
        while (zerosLength > 0) {
            sb.append("0");
            zerosLength--;
        }
        sb.append(countStr);
        return sb.toString();
    }

}
