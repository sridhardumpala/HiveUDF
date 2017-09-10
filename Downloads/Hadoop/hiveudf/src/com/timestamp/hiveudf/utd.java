package com.timestamp.hiveudf;
import java.util.Date;
import java.text.DateFormat;

import org.apache.hadoop.hive.ql.exec.UDF;
//import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class utd extends UDF{
    public Text evaluate(Text text) {
        if(text == null) return null;
        long timestamp = Long.parseLong(text.toString());
        return new Text(toDate(timestamp));
    }
    
    private String toDate(long timestamp) {
        Date date = new Date (timestamp * 1000);
        return DateFormat.getInstance().format(date).toString();
    }
}