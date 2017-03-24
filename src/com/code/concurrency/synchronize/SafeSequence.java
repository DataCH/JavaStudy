package com.code.concurrency.synchronize;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SafeSequence {

    private static Integer count = 0;

    private static final Integer sequenceLength = 5;

    public synchronized static String getSequence() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateStr = sdf.format(new Date());
        return dateStr + getCountSequence();
    }

    private static String getCountSequence() {
        count++;
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
